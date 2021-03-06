package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("./inOutFile/reader.txt")) {
            int i;
            while((i = fileReader.read()) != -1) {
                System.out.println((char) i);
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
