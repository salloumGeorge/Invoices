package com.george.solid;

import com.george.solid.book.Book;
import com.george.solid.book.Invoice;
import com.george.solid.output.InvoicePrinter;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {
        Book book = new Book("Clean Code", "Robert Martin", 2008, 40, "12312412");
        Invoice invoice = new Invoice(book, 2, 0.1, 0.11);

        invoice.saveToFile("invoices.txt");

        double v = invoice.calculateTotal();
        System.out.println(v);

        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printsInvoice(invoice);
    }
}
