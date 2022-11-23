package mapDemos;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo1 {
    public static void main(String[] args) {
        //ConcurrentHashMap
        Map<Integer,String> laptopmap = new ConcurrentHashMap<>();
        laptopmap.put(1,"IBM");
        laptopmap.put(2,"IBM");
        laptopmap.put(3,"Dell");
        laptopmap.put(4,"HCL");
        System.out.println("ConcurrentHashMap is: "+laptopmap);
    }
}
