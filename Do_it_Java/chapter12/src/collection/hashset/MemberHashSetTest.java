package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member lee = new Member(1001, "이동국");
        Member son = new Member(1002, "손흥민");
        Member park = new Member(1003, "박지성");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(son);
        memberHashSet.addMember(park);
        memberHashSet.showAllMember();

        Member hong = new Member(1003, "홍길동");
        memberHashSet.addMember(hong);
        memberHashSet.showAllMember(); //Member의 hashcode(), equals() 메소드를 오버라이딩해야 비교할 수 있음

    }
}
