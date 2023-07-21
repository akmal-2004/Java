package lessons.threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Qizil()).start();
        Thread.sleep(3000);
        new Thread(new Sariq()).start();
        Thread.sleep(3000);
        new Thread(new Yashil()).start();
    }

    static class Qizil implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("<-- qizil -->");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Yashil implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("<-- yashil -->");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Sariq implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("<-- sariq -->");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
