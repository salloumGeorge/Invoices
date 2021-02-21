package com.george.solid;

import com.george.solid.book.Book;
import com.george.solid.book.Invoice;

public class MainApp {

    public static void main(String[] args) {

        /*
         * SRP
         * */
        Book cleanCodeBook = new Book("Clean Code", "Robert C Martin", 2008, 42, "9780132350884");
        new Invoice(cleanCodeBook, 2, 2.0, 8.0);
    }
}
