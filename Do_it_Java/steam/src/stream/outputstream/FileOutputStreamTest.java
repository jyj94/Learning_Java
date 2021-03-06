package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("out.txt", true)) {
            fileOutputStream.write(65);
            fileOutputStream.write(66);
            fileOutputStream.write(67);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
