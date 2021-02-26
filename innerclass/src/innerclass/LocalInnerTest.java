package innerclass;

class Outter {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        class MyRunnable implements Runnable {
            int localNum = 10;
            @Override
            public void run() {
                System.out.println("i =  " + i);
                System.out.println("num =  " + num);
                System.out.println("localNum =  " + localNum);
                System.out.println("outNum =  " + outNum);
                System.out.println("Outter.sNum =  " + Outter.sNum);

            }
        }
        return new MyRunnable();
    }
}
public class LocalInnerTest {
    public static void main(String[] args) {
        Outter out = new Outter();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
