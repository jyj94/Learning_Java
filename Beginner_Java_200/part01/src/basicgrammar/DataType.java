package basicgrammar;

public class DataType {
    public static void main(String[] args) {
        //data type, variable
        boolean isTrue = true;
        char Character = 'A';
        int year = 2021;
        float pi = (float) 3.14;

        //reference type
        String str = new String("Java Basic grammar.");

        //operator
        System.out.println(1+1);
        System.out.println(2-1);
        System.out.println(3*2);
        System.out.println(((Double) 3.0/2));
        System.out.println(3%2);
        System.out.println(1>1);
        System.out.println(1>=1);
        System.out.println(1==1);
        System.out.println(1!=1);

        //if statement
        if (1 == 1) System.out.println("true");
        else System.out.println("false");
        int a = (1 != 1)? 1 : 2;
        System.out.println(a);

        //switch case statement
        int i = 5;
        switch (5) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("default");
        }

        //for statement
        for (i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while statement
        boolean flag = true;
        i = 0;
        while (flag) {
            if (i < 100) i++;
            else {
                System.out.println("end");
                flag = false;
            }
        }

        //String
        String str1 = new String("str1");
        String str2 = "str2";

        //array
        int[] intArr = new int[5];
        int[] intArr2 = {1,2,3,4,5};
    }
}
