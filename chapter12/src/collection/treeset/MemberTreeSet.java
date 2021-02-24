package collection.treeset;

import java.util.*;

import collection.Member;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }
    public void addMember(Member member) {
        treeSet.add(member);
    }
    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println("대항하는 아이디가 없습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
