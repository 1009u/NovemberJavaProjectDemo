package mapDemos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> laptopmap = new HashMap<>();
        laptopmap.put(1,"IBM");
        laptopmap.put(2,"Dell");
        laptopmap.put(3,"HCL");
        // create a synchronized map
        Map<Integer,String> syncmap =
                Collections.synchronizedMap(laptopmap);
        System.out.println("Synchronized map is : "+syncmap);
    }
}
