package stream.other;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("./inOutFile/newFile.txt");
        try {
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            file.delete();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
