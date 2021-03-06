package stream.inputstream;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine();
        String job = console.readLine();
        char[] pass = console.readPassword();
        String strPass = new String(pass);

        System.out.println(name);
        System.out.println(job);
        System.out.println(strPass);
    }
}
