package basicgrammar;

public class Date {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        System.out.println("current Time milli second : " + millis);
        Date d = new Date();
        System.out.print(d);
    }
}
