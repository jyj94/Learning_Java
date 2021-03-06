package map.hashmap;

import java.util.*;
import collection.Member;

public class MeberHashMap {
    private HashMap<Integer, Member> hashMap;
    public MeberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }
    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        else {
            System.out.println("회원이 존재하지 않습니다.");
            return false;
        }
    }
    public void showAllMember() {
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
