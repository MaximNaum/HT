package t3;

public class Class2 {
    public synchronized void method2() {
        System.out.print(" 2 ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
