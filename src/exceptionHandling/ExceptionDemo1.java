package exceptionHandling;

import java.util.ArrayList;

// try and catch :The try statement allows you to define a block of code to be tested for errors while it is being executed.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//The try and catch keywords come in pairs.
public class ExceptionDemo1 {
    public void expDemo(){
        try {
            ArrayList<Integer> arrayList=new ArrayList<>();
            //use add method for add integer values
            arrayList.add(12);
            arrayList.add(58);
            // use remove method
            arrayList.remove(3);
            // advance for loop for print statement
            for (Integer num: arrayList){
                System.out.println("Numbers are :"+num);
            }
            }
        catch (Exception e){
            System.out.println("Some thing wrong please check :- "+e);
        }
        finally {
            System.out.println("try and catch block is finished here with previous result.");

        }
    }
    public static void main(String[] args) {
     ExceptionDemo1 obj=new ExceptionDemo1();
     obj.expDemo();
    }
}
