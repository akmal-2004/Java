package lessons.threading;

public class TrafficSignals {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Red()).start(); Thread.sleep(5000);
        new Thread(new Yellow()).start(); Thread.sleep(2000);
        new Thread(new Green()).start(); Thread.sleep(5000);
    }

    static class Red implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("\n\n\n\n\n<<-- Red Light -->>\n\n\n\n\n");
                try {
                    Thread.sleep(14000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Yellow implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("\n\n\n\n\n<<-- Yellow Light -->>\n\n\n\n\n");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Green implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("\n\n\n\n\n<<-- Green Light -->>\n\n\n\n\n");
                try {
                    Thread.sleep(14000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}