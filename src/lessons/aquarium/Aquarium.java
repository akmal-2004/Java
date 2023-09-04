package lessons.aquarium;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Random;

public class Aquarium extends Thread{
    public static ArrayList<Fish> fishes = new ArrayList<Fish>();
    public static final int WIDTH = 65;
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
        for (int i = 0; i < 15; i++) {
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
                for (int i = 0; i < fishes.size(); i ++) {
                    for (int j = 0; j < fishes.size(); j ++) {
                        if (fishes.get(i).getX() == fishes.get(j).getX() && fishes.get(i).getY() == fishes.get(j).getY()) {
                            if (fishes.get(i) instanceof Rock && fishes.get(j) instanceof Paper) {
                                fishes.get(i).die();
                                fishes.remove(i);
//                                System.out.println("ROCK DIED!!!");
                            }
                            else if (fishes.get(i) instanceof Paper && fishes.get(j) instanceof Scissors) {
                                fishes.get(i).die();
                                fishes.remove(i);
//                                System.out.println("PAPER DIED!!!");
                            }
                            else if (fishes.get(i) instanceof Scissors && fishes.get(j) instanceof Rock) {
                                fishes.get(i).die();
                                fishes.remove(i);
//                                System.out.println("SCISSORS DIED!!!");
                            }
                        }
                    }
                }
            }
        }).start();
    }

    private static void printAquarium() throws InterruptedException {
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
            Thread.sleep(700);
        }
    }
}
