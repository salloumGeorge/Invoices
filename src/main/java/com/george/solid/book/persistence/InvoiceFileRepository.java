package com.george.solid.book.persistence;

import com.george.solid.book.Invoice;
import com.george.solid.book.output.InvoicePrinter;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceFileRepository {
    public InvoicePrinter invoicePrinter;

    public InvoiceFileRepository(InvoicePrinter invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void saveToFile(String filename, Invoice invoice) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);

        // Creates a file with given name and writes the invoice
    }
}
