public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("안녕하세요.");
        stringBuffer.append("또 만나요.");
        stringBuffer.append("모두를 사랑해요.");
        System.out.println(stringBuffer.toString() + stringBuffer.hashCode());
        stringBuffer.replace(0, 2, "나보기가 역겨워");
        System.out.println(stringBuffer.toString() + stringBuffer.hashCode());
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString() + stringBuffer.hashCode());
        stringBuffer.delete(10, 15);
        System.out.println(stringBuffer.toString() + stringBuffer.hashCode());
        repleace(stringBuffer);
        System.out.println(stringBuffer.toString() + stringBuffer.hashCode());
    }
    public static void repleace(StringBuffer stringBuffer) {
        stringBuffer.reverse();
        stringBuffer.replace(0, 3, "GoGo");
    }
}
