package lessons.homework.distance;

public abstract class Distance {
    protected double [] x,y;
    void input(double [] x, double [] y) {
        this.x = x;
        this.y = y;
    }
    public abstract void calculate();
    public abstract void print();
    public abstract void formula();
}
