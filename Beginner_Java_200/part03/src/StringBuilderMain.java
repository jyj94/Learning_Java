import java.awt.*;
import java.io.IOException;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I");
        stringBuilder.append(" go");
        stringBuilder.append(" to school.");
        System.out.println(stringBuilder);
        stringBuilder.replace(7, 11, "");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder);
        stringBuilder.delete(1, 3);
        System.out.println(stringBuilder);
        String ss = stringBuilder.substring(0);
        System.out.println(stringBuilder);
        System.out.println(ss);
        String st = stringBuilder.substring(0, 4);
        System.out.println(stringBuilder);
        System.out.println(st);




    }
}
