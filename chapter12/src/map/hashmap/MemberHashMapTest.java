package map.hashmap;
import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MeberHashMap memberHashMap = new MeberHashMap();

        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");
        Member park = new Member(1003, "박서휜");
        Member hone = new Member(1004, "홍길동");

        memberHashMap.addMember(lee);
        memberHashMap.addMember(son);
        memberHashMap.addMember(park);
        memberHashMap.addMember(hone);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
