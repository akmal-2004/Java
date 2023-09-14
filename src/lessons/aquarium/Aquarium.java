package lessons.aquarium;

import java.util.ArrayList;
import java.util.Random;

public class Aquarium extends Thread{
    public static ArrayList<Fish> fishes = new ArrayList<>();
    public static final int WIDTH = 70;
    public static final int HEIGHT = 9;

    public static void main(String[] args) throws InterruptedException {
        createFishes();
        check();
        printAquarium();
    }

    public static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private static void createFishes() {
        for (int i = 0; i < 10; i++) {
            fishes.add( new Rock(rand(1, WIDTH), rand(1, HEIGHT)) );
            fishes.add( new Scissors(rand(1, WIDTH), rand(1, HEIGHT)) );
            fishes.add( new Paper(rand(1, WIDTH), rand(1, HEIGHT)) );
        }
        for (Fish f : fishes)
            new Thread(f).start();
    }

    private static void check() {
        new Thread(() -> {
            while (true) {
                for (Fish i : fishes) {
                    for (Fish j : fishes) {
                        if (i.getX() == j.getX() && i.getY() == j.getY()) {
                            if (i instanceof Rock && j instanceof Paper) {
                                i.die();
                                fishes.remove(i);
                                System.out.println("ROCK DIED!!!");
                            }
                            else if (i instanceof Paper && j instanceof Scissors) {
                                i.die();
                                fishes.remove(i);
                                System.out.println("PAPER DIED!!!");
                            }
                            else if (i instanceof Scissors && j instanceof Rock) {
                                i.die();
                                fishes.remove(i);
                                System.out.println("SCISSORS DIED!!!");
                            }
                        }
                    }
                }
            }
        }).start();
    } // first kill, then clear

    private static void printAquarium() throws InterruptedException {
        //noinspection InfiniteLoopStatement
        while (true) {
            for (int y = 1; y <= HEIGHT; y++) {
                for (int x = 1; x <= WIDTH; x++) {
                    for (Fish f : fishes)
                        if (f.getX() == x && f.getY() == y)
                            System.out.print(f.getName());
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.print("total: " + Fish.getNumberOfFishes());
            System.out.print("  rocks: " + Rock.getNumberOfRocks());
            System.out.print("  scissors: " + Scissors.getNumberOfScissors());
            System.out.print("  papers: " + Paper.getNumberOfPapers());
            System.out.println();
            //noinspection BusyWait
            Thread.sleep(100);
        }
    }
}
