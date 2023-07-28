package lessons.threading;

public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task");
            }
        };

        Runnable runnable2 = () -> {
            System.out.println("task 2");
        };

        Thread thread = new Thread();
    }
}

class Task implements Runnable {

    @Override
    public void run() {

    }
}

class Task2 extends Thread {

}
