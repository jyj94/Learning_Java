package stream.inputstream;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String job = scanner.nextLine();
        int num = scanner.nextInt();

        System.out.println(name);
        System.out.println(job);
        System.out.println(num);

    }
}
