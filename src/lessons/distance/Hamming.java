package lessons.distance;

public class Hamming extends Distance {


    @Override
    public void calculate() {
        double M = 0.0;
        for (int i=0; i<x.length; i++) {
            M+=Math.abs(x[i] - y[i]);
        }
        System.out.println(M);
    }


    @Override
    public void print() {
        System.out.println("X: ");
        for (double i : this.x) System.out.println(i + " ");
        System.out.println();
        System.out.println("Y: ");
        for (double i : this.y) System.out.println(i + " ");
        System.out.println();
    }

    @Override
    public void formula() {
        System.out.println("p(x, y) = sumOf[1, n) |xi - yi|");
    }
}
