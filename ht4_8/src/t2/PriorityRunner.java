package t2;

public class PriorityRunner {

    public static void main(String[] args) {

        PriorityThread minPriorityThread = new PriorityThread("Min Priority Thread");
        PriorityThread maxPriorityThread = new PriorityThread("Max Priority Thread");
        PriorityThread normPriorityThread = new PriorityThread("Normal Priority Thread");

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);

        minPriorityThread.start();
        maxPriorityThread.start();
        normPriorityThread.start();
    }
}

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
