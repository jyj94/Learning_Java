public class GeoPoint2 {
    public static void main(String[] args) {
        Geo geo1 = new Geo(37.5642135, 127.0016985);
        Geo geo2 = new Geo(35.1379222, 129.05562775);

        System.out.println(geo1.latitude + "\t" + geo1.longitude);
        System.out.println(geo2.latitude + "\t" + geo2.longitude);
    }
}
