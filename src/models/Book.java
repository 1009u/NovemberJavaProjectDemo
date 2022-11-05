package models;

public class Book {
    String name;
    String author;
    int price ;
    int edition;

    public Book(String name, String author, int prince, int edition) {
        this.name = name;
        this.author = author;
        this.price = prince;
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrince() {
        return price;
    }

    public void setPrince(int prince) {
        this.price = prince;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }


}
