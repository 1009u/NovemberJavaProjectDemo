package iterator;

import java.util.ArrayList;
import java.util.Iterator;

// Definition : An Iterator is an object that can be used to loop through collections,
// like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
public class IteratorDemo1 {

    public void iteratorArrayList(){
        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("Laptop");
        arrayList.add("Key board");
        arrayList.add("Mouse");
        arrayList.add("Speaker");
        arrayList.add("CPU");

        // Now we will create iterator
        //Syntax : Iterator<Data Type> iterator_object_name= List/Map's_object_name.iterator();
        Iterator<String > iterator= arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
     IteratorDemo1 iteratorDemo1=new IteratorDemo1();
     iteratorDemo1.iteratorArrayList();
    }
}
