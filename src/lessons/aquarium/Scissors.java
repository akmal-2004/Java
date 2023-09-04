package lessons.aquarium;

public class Scissors extends Fish {
    private static long numberOfScissors = 0;

    Scissors(int x, int y) {
        super("✂", x, y);
        numberOfScissors ++;
    }

    public static long getNumberOfScissors() {
        return numberOfScissors;
    }

    @Override
    public void die() {
        this.alive = false;
        numberOfFishes --;
        numberOfScissors --;
    }
}
