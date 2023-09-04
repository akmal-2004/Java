package lessons.aquarium;

import java.util.Random;

public abstract class Fish implements Runnable {
    static long numberOfFishes = 0;
    private final String NAME;
    private int x;
    private int y;
    boolean alive = true;

    Fish(String name, int x, int y) {
        this.NAME = name;
        this.x = x;
        this.y = y;
        numberOfFishes++;
    }

    public static long getNumberOfFishes() {
        return numberOfFishes;
    }

    public String getName() {
        return this.NAME;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void die();

    @Override
    public void run() {
        Random random = new Random();
        while (alive) {
            if (this.x > 1 && this.x < Aquarium.WIDTH)
                if (random.nextInt(2) == 1) this.x ++;
                else this.x --;
            else
            if (this.x == 1 && random.nextInt(2) == 1)
                this.x ++;
            if (this.x == Aquarium.WIDTH && random.nextInt(2) == 1)
                this.x --;

            if (this.y > 1 && this.y < Aquarium.HEIGHT)
                if (random.nextInt(2) == 1) this.y ++;
                else this.y --;
            else
            if (this.y == 1 && random.nextInt(2) == 1)
                this.y ++;
            if (this.y == Aquarium.HEIGHT && random.nextInt(2) == 1)
                this.y --;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// косатка акула лосось
