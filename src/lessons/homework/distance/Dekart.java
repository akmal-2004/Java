package lessons.homework.distance;

public class Dekart extends Distance {
    @Override
    public void calculate() {
        double S = 0.0;
        for (int i=0; i<x.length; i++) {
            S += Math.pow(x[i] - y[i],2);
        }
        System.out.println(Math.sqrt(S));
    }


    @Override
    public void print() {
        System.out.println("X: ");
        for (double i:this.x) System.out.println(i + " ");
        System.out.println();
        System.out.println("Y: ");
        for (double i:this.y) System.out.println(i + " ");
        System.out.println();
    }

    @Override
    public void formula() {
        System.out.println("p(x, y) = sqrt((x1 - y1) ^ 2 + ... + (xn - yn) ^ 2)");
    }
}
