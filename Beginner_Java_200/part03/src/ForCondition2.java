import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            ilist.add(i);
        }
        for (int m : ilist) {
            s += m * m;
            System.out.println(m * m + "\t");
        }
        System.out.println();
        System.out.println("Sum is " + s);
    }
}
