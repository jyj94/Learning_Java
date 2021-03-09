public class S83BillboardMain2 {
    public static void main(String[] args) {
        S83Billboard b1 = new S83Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
        showAbout(b1);
        S83Billboard b = b1;
        showAbout(b);
    }
    public static void showAbout(S83Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastWeek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
