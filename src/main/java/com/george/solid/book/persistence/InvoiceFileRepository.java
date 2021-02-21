package com.george.solid.book.persistence;

import com.george.solid.book.Invoice;
import com.george.solid.book.InvoiceDetailsProvider;
import com.george.solid.book.output.InvoicePrinter;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceFileRepository {
    public InvoiceDetailsProvider detailsProvider = new InvoiceDetailsProvider();


    public void saveToFile(String filename, Invoice invoice) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(detailsProvider.getDetails(invoice));
        }
    }
}
