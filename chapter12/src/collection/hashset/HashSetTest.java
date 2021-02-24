package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("조영재"));
        hashSet.add(new String("김영호"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("조영재"));

        System.out.println(hashSet);

    }
}
