package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("output2.txt", true)) {
            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data++;
            }
            fileOutputStream.write(bytes);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("출력 완료");
    }
}
