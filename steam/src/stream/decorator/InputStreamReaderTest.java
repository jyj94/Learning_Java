package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("./inOutFile/reader.txt"))) {
            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
