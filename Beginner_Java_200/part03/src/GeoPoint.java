public class GeoPoint {
    public static void main(String[] args) {
        double latitude1 = 37.413294;
        double longitude1 = 127.269311;
        double latitude2 = 35.1379222;
        double longitude2 = 129.05562775;
        System.out.println(latitude1 + "\t" + longitude1);

        double[] latlng1 = {latitude1, longitude1};
        double[] latlng2 = {latitude2, longitude2};

        double[][] latllng = {{latitude1, longitude1}, {latitude2, longitude2}};
        System.out.println(latllng[0][0] + "\t" + latllng[0][1]);
    }
}
