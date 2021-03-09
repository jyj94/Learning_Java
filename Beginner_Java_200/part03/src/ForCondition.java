public class ForCondition {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            s += i;
        }
        System.out.println("1~100까지 합" + s);
        s = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) s += i;
        }
        System.out.println("1~100 사이의 홀수의 합 : " + s);
    }
}
