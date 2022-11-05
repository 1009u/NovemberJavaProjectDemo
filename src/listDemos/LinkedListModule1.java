package listDemos;

import models.Book;


import java.util.LinkedList;

public class LinkedListModule1 {

    public void demoLinkedList(){
        LinkedList<Book> linkedList=new LinkedList<>();
        Book book=new Book("You can Win","Shiv Khera",499,2002);
        Book book1=new Book("Public behaviour","Dell Karnegi",99,2004);
        Book book2=new Book("7 Habits of Effective People","Stephen R.Karvi",399,2005);
        Book book3=new Book("Sawaal Hi Jawaab Hai","Allen Peez",177,2005);

        linkedList.add(book);
        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);


        book1.setAuthor("Dail Karnegi");
        book3.setPrince(170);

        linkedList.addFirst(book3);


        for (Book book_names:linkedList) {

            System.out.println(book_names.getName()+" "+book_names.getAuthor()+" "+book_names.getPrince()+" "+book_names.getEdition());
        }

    }

    public static void main(String[] args) {
        LinkedListModule1 linkedListModule1=new LinkedListModule1();
        linkedListModule1.demoLinkedList();
    }
}
