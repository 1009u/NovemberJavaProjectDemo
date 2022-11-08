package importantKeyWord;

import models.Book;

import java.util.ArrayList;

// Final : When we use final key word than we can't change than it. we can't extend final class, when we declare final variable
// ,Data types we can't change them value.
public class finalKeyDemo1 {
    public final void demoFinal(){
        ArrayList<Book> arrayList=new ArrayList<>();
        final Book book=new Book("You can win","shiv khera",599,2022);
        arrayList.add(book);

        //Note : Because here we are making book's data as a final than we can't modify it
         // book.setName();
        // book.setPrince();
        // book.setAuthor();
        // book.setEdition();

        for (Book books: arrayList){
            System.out.println(books.getName());
            System.out.println(books.getAuthor());
            System.out.println(books.getPrince());
            System.out.println(books.getEdition());
        }
    }
    public static void main(String[] args) {
   finalKeyDemo1 obj=new finalKeyDemo1();
   obj.demoFinal();
    }
}
