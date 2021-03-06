package stream.reader;

import java.io.*;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("./inOutFile/writer.txt")) {
            fileWriter.write('A');
            char buf[] = {'B', 'C', 'E','F', 'G'};

            fileWriter.write(buf);
            fileWriter.write("잘 써집니다.");
            fileWriter.write(buf, 1, 2);
            fileWriter.write("65");
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
