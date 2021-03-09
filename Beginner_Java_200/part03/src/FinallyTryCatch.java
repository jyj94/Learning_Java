public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            int x= 5;
            int y = 20 / (5 - x);
            System.out.println(y);
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("0으로 나눴는지 확인해봐!!");
        }
        finally {
            System.out.println("난 수행되어야만 해");
        }
    }
}
