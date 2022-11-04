package listDemos;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

       // Syntax: LinkedList <DataType> objectName=new LinkedList();

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Black");
        linkedList.add("Red");
        linkedList.add("White");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Violate");

        linkedList.addFirst("Orange");
        linkedList.addLast("Yellow");
        linkedList.getFirst();

        System.out.println(linkedList);

    }
}
