package interfaceex;

public interface Calc {
    //The interface defines explicitly that class and program's function and formed by abstract method, constant.
    //The method is converted to abstract method even if not specified public abstract reserved word.
    double PI = 3.14;
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1,int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    //default method can specification in interface.
    default void description() {
        System.out.println("Integer calculator");
        myMethod();
        myStaticMethod();
    }
    //If you use static method can use without instants.
    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
    //IF you use private method abstract class can't use or redefine that method.
    //And it can use with static reserve word to static method.
    private void myMethod() {
        System.out.println("Private method.");
    }
    private static void myStaticMethod() {
        System.out.println("Private static method.");
    }
}
