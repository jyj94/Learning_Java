import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class S92RequestFromBillboardHot {
    ArrayList<String> htmls = new ArrayList<String>();
    boolean isConnection = false;

    public S92RequestFromBillboardHot() {
        htmls.clear();
    }
    public void getAllHtml(String newUrls) {
        htmls.clear();
        URL url = null;
        try {
            url = new URL(newUrls);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (!line.trim().equals("")) htmls.add(line.trim());
            }
            isConnection = true;
        }
        catch (Exception e) {
            isConnection = false;
            e.printStackTrace();
        }
    }
    public void printHtml() {
        for (String ss : htmls) System.out.println(ss);
    }
    public String getTimeDate(String newUrls) {
        String s = "";
        URL url = null;
        try {
            url = new URL(newUrls);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (!line.trim().equals("")) {
                    if (line.trim().contains("<time datetime=")) {
                        s = line.trim();
                        s = s.substring(0, s.indexOf(">") - 1);
                        s = s.substring(s.indexOf("\"") + 1).trim();
                        break;
                    }
                }
            }
            isConnection = true;
        }
        catch (Exception e) {
            isConnection = false;
            e.printStackTrace();
        }
        return s;
    }
    public static void main(String[] args) {
        S92RequestFromBillboardHot rfw = new S92RequestFromBillboardHot();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println("이번주" + rs);
//        rs = RestDay.toWantedDay(rs, 1);
        System.out.println(rs);
        rfw.getAllHtml(a + rs);
        rfw.printHtml();
    }
}
