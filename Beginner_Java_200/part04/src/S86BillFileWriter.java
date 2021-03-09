import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class S86BillFileWriter {
    public static void main(String[] args) {
        S83Billboard b1 = new S83Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "luis fonsi");
        S83Billboard b2 = new S83Billboard(2, "That's What I Like", 2, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "bruno mars");
        S83Billboard b3 = new S83Billboard(3, "I'm The One", 3, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "Dj Khaled");
        ArrayList<S83Billboard> bblist = new ArrayList<>();
        bblist.add(b1);
        bblist.add(b2);
        bblist.add(b3);

        File f= new File("billboard");
        if (!f.exists()) {f.mkdirs();}
        try(PrintWriter pw = new PrintWriter(new FileWriter("Billboard/bill.txt", false), true)) {
            for (S83Billboard bb : bblist) pw.println(bb);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
