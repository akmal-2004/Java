package lessons.aquarium;

public class Rock extends Fish {
    private static long numberOfRocks = 0;

    Rock(int x, int y) {
        super("🛢", x, y);
        numberOfRocks ++;
    }

    public static long getNumberOfRocks() {
        return numberOfRocks;
    }

    @Override
    public void die() {
        this.alive = false;
        numberOfFishes --;
        numberOfRocks --;
    }
}
