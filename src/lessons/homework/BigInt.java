package lessons.homework;
// BigInt with base

public class BigInt {
    private int[] values;
    private static final int limit = 100;
    private final int digitsLen = 2;
    private int size;
    private char sign = '+';

    public BigInt(String value) {
        values = new int[limit];
        size = (int) Math.ceil(value.length() / (double)digitsLen);

        for (int ch = value.length() - 1, j = 0; ch >= 0; ch -= digitsLen, j ++) {
            if (ch >= 1) {
                values[j] = (value.charAt(ch - 1) - '0');
                values[j] = values[j] * 10 + (value.charAt(ch) - '0');
            }
            else values[j] = (value.charAt(ch) - '0');
        }
    }

    public void plus(BigInt add) {
        int rem = 0;
        setSize(Math.max(getSize(), add.getSize()));
        for (int i = 0; i < getSize(); i++) {
            values[i] = values[i] + add.getValues(i) + rem;
            rem = values[i] / (int) Math.pow(10, digitsLen);
            values[i] %= (int) Math.pow(10, digitsLen);
//            System.out.println("adding: " + values);
        }
        if (rem > 0) {
            values[size++] = rem;
        }
    }

    public void minus(BigInt sub){
        int rem = 0;
        int p = 0;
        for (int i = 0; i < getSize(); i++) {
            if (values[i] - sub.getValues(i) < 0) {
                p = (int) Math.pow(10, digitsLen);
                rem = 1;
            }
            values[i] = values[i] + p - sub.getValues(i);
            values[i + 1] -= rem;
            p = 0;
            rem = 0;
            while (getSize() > 1 && values[getSize() - 1] == 0) size --;
        }
    }

    public void multiply(BigInt mult) {
        int[] prod = new int[getSize() + mult.getSize()];
        int rem;

        for (int i = 0; i < mult.getSize(); i++) {
            rem = 0;
            for (int j = 0; j < getSize(); j++) {
                int p = values[j] * mult.getValues(i) + prod[i + j] + rem;
                prod[i + j] = p % (int) Math.pow(10, digitsLen);
                rem = p / (int) Math.pow(10, digitsLen);
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

    public void divide(BigInt divisor) {
        BigInt quotient = new BigInt("0");
        BigInt remainder = new BigInt("0");

        for (int i = getSize() - 1; i >= 0; i--) {
            remainder.multiply(new BigInt("10"));
            remainder.plus(new BigInt(String.valueOf(getValues(i))));
            int count = 0;

            while (remainder.compare(divisor) || remainder.equals(divisor)) {
                remainder.minus(divisor);
                count++;
            }

            quotient.values[i] = count;
        }
//        System.out.println("quotient: " + quotient.toStr());
//        System.out.println("remainder: " + remainder.toStr());

        setSize(quotient.getSize());
        for (int i = 0; i < getSize(); i++) {
            values[i] = quotient.getValues(i);
        }
        clearLeadingZeros();
    }

//    public void divide(BigInt divisor) {
//        BigInt quotient = new BigInt("0");
//        BigInt remainder = new BigInt("0");
//
//        for (int i = getSize() - 1; i >= 0; i--) {
//            remainder.multiply(new BigInt("10"));
//            remainder.plus(new BigInt(String.valueOf(getValues(i))));
//            int count = 0;
//
//            while (remainder.compare(divisor) || remainder.equals(divisor)) {
//                remainder.minus(divisor);
//                count++;
//            }
//
//            quotient.values[i] = count;
//        }
//
//        setSize(quotient.getSize());
//        for (int i = 0; i < getSize(); i++) {
//            values[i] = quotient.getValues(i);
//        }
//        clearLeadingZeros();
//    }

/** Simple divide method
    public void divide(BigInt div){
        BigInt one = new BigInt("1");
        BigInt cnt = new BigInt("0");
        while (compare(div)) {
            minus(div);
            cnt.plus(one);
        }
        values = new int[limit];
        plus(cnt);
    }
**/

    public boolean compare(BigInt b) {
        if (getSize() > b.getSize()) return true;
        if (getSize() < b.getSize()) return false;

        for (int i = 0; i < getSize(); i++) {
            if (getValues(i) > b.getValues(i)) return true;
            if (getValues(i) < b.getValues(i)) return false;
        }
        return true;
    }

    public void clearLeadingZeros() {
        while (size != 0 && values[size - 1] == 0) {
            size--;
        }
    }
    public int getSize() {return this.size;}
    public void setSize(int size) { this.size = size;}
    public int getValues(int index) {return values[index];}
    public void setValues(int index, int value) {values[index] = value;}

    public void print(){
        for (int i = getSize() - 1; i >= 0; i --) {
            if (getValues(i) < 10 && i != getSize() - 1) System.out.print("0" + getValues(i));
            else System.out.print(values[i]);
        }
        System.out.println();
//        System.out.println(values);
//        System.out.println(getSize());
    }

    public String toStr(){
        String res = "";
        for (int i = getSize() - 1; i >= 0; i --) {
            if (getValues(i) < 10 && i != getSize() - 1) res += ("0" + getValues(i));
            else res += (values[i]);
        }
        return res;
    }
}
