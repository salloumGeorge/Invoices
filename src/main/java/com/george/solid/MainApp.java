package com.george.solid;

import com.george.solid.book.Book;
import com.george.solid.book.Invoice;
import com.george.solid.book.InvoiceTestSummarizer;
import com.george.solid.book.output.InvoicePrinter;

public class MainApp {

    public static void main(String[] args) {

        /*
         * SRP
         * */

        //Book cleanCodeBook = new Book("Clean Code", "Robert C Martin", 2008, 42, "9780132350884");
        Book.BookBuilder builder = Book.BookBuilder.aBook()
                .withAuthorName("Robert C Martin")
                .withName("Clean Code")
                .withIsbn("970")
                .withPrice(42)
                .withYear(2008);
        Book cleanCodeBook = builder.build();
/*
        Invoice invoice = new Invoice(cleanCodeBook, 2, 0.02, 0.08);*/
        Invoice invoice = Invoice.InvoiceBuilder.anInvoice().withBook(cleanCodeBook)
                .withDiscountRate(0.02)
                .withQuantity(2)
                .withTaxRate(0.08).build();

        InvoicePrinter invoicePrinter = new InvoicePrinter(new InvoiceTestSummarizer());
        invoicePrinter.printInvoice(invoice);


    }
}
