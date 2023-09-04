package lessons.aquarium;

public class Paper extends Fish {
    private static long numberOfPapers = 0;

    Paper(int x, int y) {
        super("📄", x, y);
        numberOfPapers ++;
    }

    public static long getNumberOfPapers() {
        return numberOfPapers;
    }

    @Override
    public void die() {
        this.alive = false;
        numberOfFishes --;
        numberOfPapers --;
    }
}
