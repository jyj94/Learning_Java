package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("input.txt");
            System.out.print((char) fileInputStream.read());
            System.out.print((char) fileInputStream.read());
            System.out.print((char) fileInputStream.read());
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
