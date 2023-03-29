package t3;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        Thread thread1 = new Thread(() -> {
           for (int i = 0; i < 3; i++) {
               class1.method1();
           }
        });

        Thread thread2= new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                class2.method2();
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}
