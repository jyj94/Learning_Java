package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("input.txt")) {
            int i;
            while((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("end");
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
