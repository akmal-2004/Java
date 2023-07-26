package lessons.threading;

import java.security.cert.TrustAnchor;
import java.util.concurrent.ThreadLocalRandom;

public class ProducerConsumer {
    static private int number;
    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                number = ThreadLocalRandom.current().nextInt();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("current number: " + number);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}