package stream.outputstream;

import java.io.*;

public class FileOutputStreamTest3 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("output3.txt")) {
            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data++;
            }
            fileOutputStream.write(bytes, 2, 10);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
