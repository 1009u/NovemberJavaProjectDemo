package setDemos;

import models.Book;

import java.util.HashSet;

public class HashSetModule {
    public void demoHashSet(){
        //syntax: HashSet<Data_Type> object_name=new HashSet<>();
        HashSet<Book> books=new HashSet<>();
        Book book=new Book("Caste in India","Ambedkar",299,1916);
        Book book1=new Book("Mook Nayak","Ambedkar",499,1920);
        Book book2=new Book("The problem of the rupee","Ambedkar",499,1923);
        Book book3=new Book("Bahishkrut Bharat","Ambedkar",399,1927);
        Book book4=new Book("The Buddha and his Dhamma","Ambedkar",459,1957);
        Book book5=new Book("Manu and the shudras","Ambedkar",259,1910);

        books.add(book);          // add methods
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        book.setAuthor("Dr. Bheem Rao Ambedkar");    // set method use

        books.remove(book5);                         // remove method used

        for (Book bookName: books){
            System.out.println("Name of Book :"+bookName.getName());
            System.out.println("Author Name :"+bookName.getAuthor());
            System.out.println("Expected Price of Book :"+bookName.getPrince());
            System.out.println("Edition Year :"+bookName.getEdition());
        }

    }
    public static void main(String[] args) {
        HashSetModule hashSetModule=new HashSetModule();
        hashSetModule.demoHashSet();
    }
}
