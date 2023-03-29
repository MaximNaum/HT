package t3;

public class Class1 {
    public synchronized void method1() {
        System.out.print(" 1 ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
