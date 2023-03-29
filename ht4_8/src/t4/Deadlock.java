package t4;

import java.util.Random;

public class Deadlock {

    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        MyThreadTwo t2 = new MyThreadTwo();

        t1.setThread2(t2);
        t2.setThread1(t1);
        t1.start();
        t2.start();
    }
}

//THREAD NUMBER 1
class MyThreadOne extends Thread {

    Thread t2;

    public MyThreadOne() {
        System.out.println("MyThreadOne create");

    }

    public void run() {
        System.out.println("MyThreadOne start");
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("MyThreadOne interrupt MyThreadTwo finish…");
            t2.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne finished");
    }

    public void setThread2(Thread t) {
        this.t2 = t;
    }
}

//THREAD NUMBER 2
class MyThreadTwo extends Thread {

    Thread t1;

    public MyThreadTwo() {
        System.out.println("MyThreadTwo create");
    }

    public void run() {
        System.out.println("MyThreadTwo start");
        try {
            System.out.println("MyThreadTwo interrupt MyThreadOne finish…");
            t1.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished");
    }

    public void setThread1(Thread t) {
        this.t1 = t;
    }
}
