package exceptionHandling;

import java.util.HashMap;

public class ExceptionDemo2 {
    public void expDemo(){
        try{
            HashMap<Integer,String> hashMap=new HashMap<>();
            //put
            hashMap.put(1,"H");
            hashMap.put(2,"E");
            hashMap.put(3,"L");
            hashMap.put(4,"L");
            hashMap.put(5,"O");
            //get
            hashMap.get(1);
            hashMap.get(2);
            hashMap.get(3);
            hashMap.get(4);
            hashMap.get(5);

            //print data
            System.out.println(hashMap);

        } catch (Exception e) {
            System.out.println("Exception found :--->"+e);
        }
        finally {
            System.out.println("code finished here =============");
        }
    }
    public static void main(String[] args) {
        ExceptionDemo2 exp=new ExceptionDemo2();
        exp.expDemo();
    }
}
