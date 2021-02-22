package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int[] sample = {1, 2, 3, 4, 5, 6};

        System.out.println(Calc.total(sample));
        System.out.println();

        CompleteCalc calc = new CompleteCalc();
        Calc test = new CompleteCalc();
        System.out.println(test.add(2, 3));
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        calc.showInfo();
        calc.description();
    }
}
