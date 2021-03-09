public class ForeachLotto2 {
    public static void print(int ...mm) {
        for (int m : mm) System.out.print(m + '\t');
    System.out.println();
    }
    public static void main(String[] args) {
        int[] mm = {1, 6, 16, 22, 23, 33};
        print(mm);
        int a = 1, b = 5, c = 23;
        print(a, b, c);
    }
}
