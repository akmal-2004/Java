package lessons;//package com.example;

public class BigIntNoBase {
    private int[] values;
    private int size;
    private int limit = 50;
    private char sign = ' ';

    public BigIntNoBase(String value) {
        values = new int[limit];
        size = value.length();

        for (int i = 0; i < size; i++) {
            values[i] = value.charAt(size - 1 - i) - '0';
        }
    }

    public int getSize() {
        return this.size;
    }
    public void setSize(int size) { this.size = size;}

    public int getValues(int index) {
        return values[index];
    }
    public void setValues(int index, int value) {values[index] = value;}

    public void plus(BigIntNoBase add) {
        int rem = 0;
        size = Math.max(getSize(), add.getSize());
        for (int i = 0; i < getSize(); i++) {
            values[i] = values[i] + add.getValues(i) + rem;
            rem = values[i] / 10;
            values[i] %= 10;
        }
        if (rem > 0) {
            values[size++] = rem;
        }
        clearLeadingZeros();
    }

    public void minus(BigIntNoBase sub){
        int rem = 0;
        int p = 0;
        for (int i = 0; i < getSize(); i++) {
            if (values[i] - sub.getValues(i) < 0) {
                p = 10;
                rem = 1;
            }
            values[i] = values[i] + p - sub.getValues(i);
            values[i + 1] -= rem;
            p = 0;
            rem = 0;
            while (getSize() > 1 && values[getSize() - 1] == 0) size --;
        }
        clearLeadingZeros();
    }

    public void multiply1(BigIntNoBase mult) {
        int rem = 0;

        for (int i = 0; i < getSize(); i++) {
            values[i] = values[i] * mult.getValues(0) + rem;
            rem = values[i] / 10;
            values[i] %= 10;
        }
        if (rem > 0) {
            values[size++] = rem;
        }
        clearLeadingZeros();
    }

    public void multiply(BigIntNoBase mult) {
        int[] prod = new int[getSize() + mult.getSize()];
        int rem = 0;

        for (int i = 0; i < mult.getSize(); i++) {
            rem = 0;
            for (int j = 0; j < getSize(); j++) {
                int p = values[j] * mult.getValues(i) + prod[i + j] + rem;
                prod[i + j] = p % 10;
                rem = p / 10;
            }
            if (rem > 0) {
                prod[i + getSize()] += rem;
            }
        }
        setSize(prod.length);
        for (int i = prod.length - 1; i >= 0; i --) {
            values[i] = prod[i];
        }
        clearLeadingZeros();
    }


    public void divide(BigIntNoBase div){
        BigIntNoBase one = new BigIntNoBase("1");
        BigIntNoBase cnt = new BigIntNoBase("0");
        while (compare(div)) {
            minus(div);
            cnt.plus(one);
        }
        values = new int[limit];
        plus(cnt);
        clearLeadingZeros();
    }

    public boolean compare(BigIntNoBase b) {
        if (getSize() > b.getSize()) return true;
        if (getSize() < b.getSize()) return false;

        for (int i = 0; i < getSize(); i++) {
            if (getValues(i) > b.getValues(i)) return true;
            if (getValues(i) < b.getValues(i)) return false;
        }
        clearLeadingZeros();
        return true;
    }

    public void clearLeadingZeros() {
        while (size != 0 && values[size - 1] == 0) {
            size--;
        }
    }

    public String toString(){
        String res = "";
        clearLeadingZeros();
        for (int i = getSize()-1; i >= 0; i --) {
            res += values[i];
        }
        return res;
    }

    public void print() {
        for (int i = getSize()-1; i >= 0; i --) {
            System.out.print(values[i]);
        }
    }
}