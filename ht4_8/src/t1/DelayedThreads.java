package t1;

public class DelayedThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread first = new Thread(() -> {
            System.out.println("First thread started");
            System.out.println("First thread finished");
        });

        Thread second = new Thread(() -> {
            System.out.println("Second thread started");
            System.out.println("Second thread finished");
        });

        first.start();
        first.join();
        second.start();
        second.join();

        System.out.println("Main thread finished");
    }
}
