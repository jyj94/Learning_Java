package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashset = new HashSet<Member>();

    public void addMember(Member member) {
        hashset.add(member);
    }

    public boolean remobeMember(int memberId) {
        Iterator<Member> ir = hashset.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member member : hashset) {
            System.out.println(member);
        }
    }
}
