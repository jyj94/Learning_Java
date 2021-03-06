package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member lee = new Member(1003, "이건희");
        Member jang = new Member(1001, "정몽주");
        Member jo = new Member(1004, "조영재");
        Member lee2 = new Member(1002, "이스라");

        memberTreeMap.addMember(lee);
        memberTreeMap.addMember(jang);
        memberTreeMap.addMember(jo);
        memberTreeMap.addMember(lee2);

        memberTreeMap.showAllMember();

        memberTreeMap.remobeMember(1004);
        memberTreeMap.showAllMember();
    }
}
