package mapDemos;

import java.util.HashMap;

// By the HashMap we can put our data in key and value format
public class HashMap1 {
    public void HashMapDemo(){
   // Syntax: HashMap<Key,Value> object_name=new HashMap<Key,Value>();
        HashMap<Integer,String> mobile=new HashMap<>();
        // put data in HashMap
        mobile.put(1,"Samsung");
        mobile.put(2,"Nokia");
        mobile.put(3,"Lava");
        mobile.put(4,"Oppo");
        mobile.put(5,"IPhone");


        // get data in HashMap
        System.out.println(mobile.get(1));
        System.out.println(mobile.get(2));
        System.out.println(mobile.get(3));
        System.out.println(mobile.get(4));
        System.out.println(mobile.get(5));

        //size method
        System.out.println("Size of Map is :"+mobile.size());



    }
    public static void main(String[] args) {
        HashMap1 hashMap1=new HashMap1();
        hashMap1.HashMapDemo();

    }
}
