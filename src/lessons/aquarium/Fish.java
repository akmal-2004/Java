package lessons.aquarium;

public abstract class Fish {
    private static long numberOfFishes = 0;
    private final String NAME;

    Fish(String name) {
        this.NAME = name;
        numberOfFishes++;
    }

    public static long getNumberOfFishes() {
        return numberOfFishes;
    }

    public String getName() {
        return this.NAME;
    }

    abstract void swim();
}

// косатка акула лосось
