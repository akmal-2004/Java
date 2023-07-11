package lessons.homework.distance;

public class Chebyshev extends Distance {

    @Override
    public void calculate() {

    double mx = 0.0;
    double S = 0;
    for(int i=0; i<x.length; i++) {
        S = Math.abs(x[i] - y[i]);
        if( S > mx) {
            mx = S;
        }
    }
        System.out.println(mx);
    }

    @Override
    public void print() {
        System.out.println("X: ");
        for(double i:this.x) System.out.println(i + " ");
        System.out.println();
        System.out.println("Y: ");
        for(double i:this.y) System.out.println(i + " ");
        System.out.println();
    }

    @Override
    public void formula() {
        System.out.println("p(x, y) = max {|xi - yi|}");
    }
}
