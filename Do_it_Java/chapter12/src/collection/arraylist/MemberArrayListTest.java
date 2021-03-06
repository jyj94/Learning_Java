package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");
        Member park = new Member(1003, "박서훤");
        Member hong = new Member(1004, "홍길동");

        memberArrayList.addMember(lee);
        memberArrayList.addMember(son);
        memberArrayList.addMember(park);
        memberArrayList.addMember(hong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(1002);
        memberArrayList.showAllMember();
        Member test = new Member(1005, "조영재");
        memberArrayList.insertMemberAt(test, 2);
        memberArrayList.showAllMember();
    }
}
