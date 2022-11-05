package setDemos;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet <Integer> hashSet=new HashSet<>();
        hashSet.add(47);
        hashSet.add(78);
        hashSet.add(74);
        hashSet.add(85);
        hashSet.add(74);
        hashSet.add(85);
        hashSet.add(47);
        hashSet.add(78);
        hashSet.add(74);

        hashSet.remove(78);   // we can use remove method

        System.out.println(hashSet);
    }
}
