package stream.other;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("./inOutFile/random.txt", "rw");
        randomAccessFile.writeInt(123);
        System.out.println("파일 포인터 위치 : " + randomAccessFile.getFilePointer());
        randomAccessFile.writeDouble(3.14);
        System.out.println("파일 포인터 위치 : " + randomAccessFile.getFilePointer());
        randomAccessFile.writeUTF("안녕하세요.");
        System.out.println("파일 포인터 위치 : " + randomAccessFile.getFilePointer());

//        포인터 위치를 0으로 이동
        randomAccessFile.seek(0);

        int i = randomAccessFile.readInt();
        double d = randomAccessFile.readDouble();
        String str = randomAccessFile.readUTF();

        System.out.println("파일 포인터 위치 : " + randomAccessFile.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
