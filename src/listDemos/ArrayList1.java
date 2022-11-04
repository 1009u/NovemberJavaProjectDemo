package listDemos;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //syntax : ArrayList <DataType> objectName = new ArrayList<DataType>();
        // add data
        ArrayList<String> names=new ArrayList<>();
        names.add("Ayush");  //0
        names.add("Piyush"); //1
        names.add("John");   //2
        names.add("Yogi");    //3

      //  System.out.println("Name of Person :" + names);
        for (String name_of_boys: names){
            System.out.println(name_of_boys);
        }




    }
}
