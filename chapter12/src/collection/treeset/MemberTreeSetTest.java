package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member park = new Member(1003, "박지성");
        Member lee = new Member(1001, "이동국");
        Member son = new Member(1002, "손흥민");

        memberTreeSet.addMember(park);
        memberTreeSet.addMember(lee);
        memberTreeSet.addMember(son);
        memberTreeSet.showAllMember();

        Member hone = new Member(1003, "홍길동");
        memberTreeSet.addMember(hone);
        memberTreeSet.showAllMember();

    }
}
