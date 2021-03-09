import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ForCondition3 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            ilist.add(i);
        }

        s = ilist.stream().reduce(0, Integer::sum);
        System.out.println("1~100의 합 : " + s);
        s = 0;
        s = ilist.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum);
        System.out.println("1~100의 합 : " + s);
        s = ilist.stream().filter(i -> i % 2 == 1).reduce(0,
                new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println("1~100의 합 : " + s);

    }
}
