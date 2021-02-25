package map.treemap;

import java.util.*;

import collection.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }
    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }
    public boolean remobeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원이 없습니다.");
        return false;
    }
    public void showAllMember() {
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        while(iterator.hasNext()) {
            int key = iterator.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
