package basicgrammar;

import java.util.concurrent.TimeUnit;

class ThreadA extends Thread {
    @Override
    public void run() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
            System.out.println("Thread A");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
class ThreadB extends Thread {
    @Override
    public void run() {
//        try {
            System.out.println("Thread B");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

public class Threads {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        for (int i = 0; i < 100; i++) {
            threadA.run();
            threadB.run();
        }
    }
}
