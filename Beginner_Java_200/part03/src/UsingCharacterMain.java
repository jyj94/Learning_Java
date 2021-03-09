public class UsingCharacterMain {
    public static void main(String[] args) {
        Character ch1 = new Character('W');
        Character ch2 = new Character('9');

        if (Character.isLetter(ch1.charValue())) {
            System.out.println("1 : " + ch1.charValue());
        }
        System.out.println();
        System.out.println('\u0057');
        System.out.println("\t");
        System.out.println(Integer.toHexString((int) ch1));


    }
}
