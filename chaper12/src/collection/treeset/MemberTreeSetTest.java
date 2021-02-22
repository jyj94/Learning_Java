package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MeberTreeSet memberTreeSet = new MeberTreeSet();

        Member memberPark = new Member(1003, "박서휜");
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHone = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHone);
        memberTreeSet.showAllMember();
    }

}
