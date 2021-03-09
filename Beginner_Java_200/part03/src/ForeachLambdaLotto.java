import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1,5,15,22,23,33);
        mmlists.forEach(m -> {System.out.println(m + "\t");});
        System.out.println();
        Consumer<Integer> consume = (Integer m) -> {System.out.println(m+"\t");};
        mmlists.forEach(consume);
        System.out.println(mmlists.getClass().getName());
    }
}
