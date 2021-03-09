public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("int인지 확인해봐");
            System.out.println(numberFormatException.getMessage());
        }
        catch (Exception exception) {
            System.out.println("야 잘 좀 넣어");
        }
        finally {
            System.out.println("난 수행되어야만 해");
        }
    }
}
