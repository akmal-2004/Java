package lessons.aquarium;

public class Shark extends Fish {
    private static long numberOfSharks = 0;

    Shark() {
        super("Shark");
        numberOfSharks ++;
    }

    public static long getNumberOfSharks() {
        return numberOfSharks;
    }

    @Override
    void swim() {
        
    }
}
