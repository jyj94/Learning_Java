package stream.inputstream;

import java.io.*;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10];
            int i;
            while((i = fileInputStream.read(bs)) != -1) {
                for (int k = 0; k < i; k++) {
                    System.out.print((char) bs[k]);
                }
                System.out.println(" : " + i + "바이트 읽음");
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("end");
    }
}
