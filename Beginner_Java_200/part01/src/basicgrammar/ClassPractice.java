package basicgrammar;

public class ClassPractice {
    public Double x;
    public Double y;

    public ClassPractice(Double x, Double y) {
        this.x = 0.0;
        this.y = 0.0;
    }

    public ClassPractice() {
        this(33.2, 31.0);
    }
    public void test(int ...test) {
        System.out.println(test.getClass().getName());
    }

    public static void main(String[] args) {
        ClassPractice classPractice = new ClassPractice();
        System.out.println(classPractice.x);
        classPractice.test(1,2,3,4);
    }
}
