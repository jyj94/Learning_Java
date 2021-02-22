package string;
//Using stringBuffer and stringbuilder can help with memory management.
//Stringbuffer vouchs changing string value safely when use multi thread, stringbuilder doesn't.
//But stringBuilder is more faster.
public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr memory location : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("buffer memory location before operating : " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!!");
        System.out.println("buffer memory location after operating : " + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("javaStr memory location : " + System.identityHashCode(javaStr));

        String test = new String("test");
        buffer.replace(0, buffer.length(), test);
        buffer.append(" test");
        System.out.println("buffer memory location after operating : " + System.identityHashCode(buffer));
        test = buffer.toString();
        System.out.println(test);

    }
}
