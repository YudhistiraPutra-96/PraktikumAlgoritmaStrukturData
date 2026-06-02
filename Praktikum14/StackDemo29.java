package Praktikum14;

import java.util.Stack;

public class StackDemo29 {
    public static void main(String[] args) {
        Book29 book1 = new Book29("1234", "Dasar Pemrograman");
        Book29 book2 = new Book29("7145", "Hafalah Shalat Delisa");
        Book29 book3 = new Book29("3562", "Muhammad Al-Fatih");

        Stack<Book29> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book29 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book29 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book29 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);

        int position = books.search(book2);
        System.out.println("Posisi book2 dari puncak: " + position);

    }    
}
