import java.util.ArrayList;
import java.util.List;

public class LottoList {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            ilist.add(i);
        }

        for (int i = 0; i < ilist.size(); i++) {
            int m = ilist.get(i);
            System.out.println(m);
        }
    }
}
