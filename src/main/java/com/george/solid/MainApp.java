package com.george.solid;

import com.george.solid.book.Book;
import com.george.solid.book.Invoice;
import com.george.solid.book.output.InvoicePrinter;
import com.george.solid.book.persistence.InvoiceFileRepository;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Book cleanCodeBook = getCleanCodeBook();
        Invoice invoice = getInvoice(cleanCodeBook);

        new InvoicePrinter().printInvoice(invoice);
        new InvoiceFileRepository().saveToFile("books.txt", invoice);


    }

    private static Invoice getInvoice(Book cleanCodeBook) {
        return Invoice.InvoiceBuilder.anInvoice().withBook(cleanCodeBook)
                .withDiscountRate(0.02)
                .withQuantity(2)
                .withTaxRate(0.08).build();
    }

    private static Book getCleanCodeBook() {
        Book.BookBuilder builder = Book.BookBuilder.aBook()
                .withAuthorName("Robert C Martin")
                .withName("Clean Code")
                .withIsbn("970")
                .withPrice(42)
                .withYear(2008);
        return builder.build();
    }
}
