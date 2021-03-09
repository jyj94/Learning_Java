import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class S85BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<S83Billboard> bills = new ArrayList<S83Billboard>();
        bills.add(new S83Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "luis fonsi"));
        bills.add(new S83Billboard(2, "That's What I Like", 2, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "bruno mars"));
        bills.add(new S83Billboard(3, "I'm The One", 3, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "Dj Khaled"));
        System.out.println(bills.size());
        for (S83Billboard b : bills) showAbout(b);
        System.out.println(bills.size());
        bills.remove(1);
        System.out.println(bills.size());
        for (S83Billboard b : bills) showAbout(b);
    }
    public static void showAbout(S83Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastWeek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
