public class S84BillboardMainObject {
    public static void main(String[] args) {
        S83Billboard b1 = new S83Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg"
                , "luis fonsi");
        S83Billboard b2 = new S83Billboard(2, "That's What I Like", 2, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "bruno mars");
        S83Billboard b3 = new S83Billboard(3, "I'm The One", 3, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "dj khaled");
        showAbout(b1);
        showAbout(b1, b2);
        showAbout(b1, b2, b3);
        S83Billboard[] b = new S83Billboard[3];
        b[0] = b1;
        b[1] = b2;
        b[2] = b3;
        showAbout(b);


    }
    public static void showAbout(S83Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastWeek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
    public static void showAbout(S83Billboard ...b) {
        for (S83Billboard bill : b) {
            showAbout(bill);
        }
    }


}
