package Praktikum14;

public class Book29 {
    public String isbn;
    public String title;
    public Book29(){
    }

    public Book29(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    
    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
