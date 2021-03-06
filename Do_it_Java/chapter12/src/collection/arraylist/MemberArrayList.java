package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }
    public void addMember(Member member) {
        arrayList.add(member);
    }
    public boolean removeMember(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            if (member.getMemberId() == memberId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "가 존재하지 않습니다.");
//        return false;
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = (Member) iterator.next();
            if (member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
    public void insertMemberAt(Member member, int index) {
        arrayList.add(index, member);
    }
}
