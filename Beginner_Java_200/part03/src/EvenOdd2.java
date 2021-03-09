public class EvenOdd2 {
    public static void showOddEven(int n) {
        int temp = n;
        do {
            if (temp % 2 == 1) {
                temp = temp * 3 + 1;
            }
            else {
                temp /= 2;
            }
            System.out.println("[" + temp + "]");
        } while (temp != 1);
        System.out.println("\n-----------------");
    }
    public static void main(String[] args) {
        showOddEven(122);
    }
}
