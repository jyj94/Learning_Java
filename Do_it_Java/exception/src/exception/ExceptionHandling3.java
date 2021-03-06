package exception;

import java.io.*;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("a.txt");
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
            return;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기도 수행됩니다.");
    }
}
