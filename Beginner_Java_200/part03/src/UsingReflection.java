public class UsingReflection {
    public static String toModi(int n) {
        String s = "";
        switch (n) {
            case 0 : s = ""; break;
            case 1 : s = "public"; break;
            case 2 : s = "private"; break;
            case 4 : s = "protected"; break;
            case 8 : s = "static"; break;
            case 10 : s = "private static"; break;
            case 9 :
            case 137 : s = "public static"; break;
            case 17 : s = "public final"; break;
            case 257 : s = "public native"; break;
            case 260 : s = "protected native"; break;
            case 273 : s = "public final native"; break;
            default : s="XXX"; break;
        }
        return s;
    }
    public static String toRe(String msg) {
        String s = "";
        if (msg.contains("[C")) {
            s = msg.substring(msg.indexOf("" ) + 1).trim();
            s = s.replace("[C", "char[] ");
        }
        else if (msg.contains("[L")) {
            s = msg.substring(msg.indexOf(" ") + 1).trim();
            s = s.replace("[L", "").replace(";", "");
            s = s.concat("[]");
        }
        else if (msg.contains("[B")) {
            s = msg.substring(msg.indexOf(" ") + 1).trim();
        }
        else {
            s = msg.trim();
        }
        return s;
    }
    public static void main(String[] args) {

    }
}
