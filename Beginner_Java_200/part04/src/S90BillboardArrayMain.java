import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class S90BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<String> html = new ArrayList<>();
        String newUrl = "https://www.billboard.com/charts/hot-100/";
        URL url = null;
        try {
            url = new URL(newUrl);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().equals("")) html.add(line.trim());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (String str : html) System.out.println(str);
    }
}
