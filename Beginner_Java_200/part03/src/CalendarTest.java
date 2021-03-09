import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        System.out.println(millis/1000/24/60/60);

        Date d = new Date();
        System.out.println(d);
        Date dd = new Date(d.getTime() + 24 *60 * 60 * 1000);
        System.out.println(dd);

//        Calendar cal1994
    }
}
