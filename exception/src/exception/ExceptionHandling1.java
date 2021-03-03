package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println(fileNotFoundException);
        }
        System.out.println("여기도 수행됩니다.");
    }
}
