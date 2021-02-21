package com.george.solid.book.output;

import com.george.solid.book.Invoice;
import com.george.solid.book.InvoiceTestSummarizer;

public class InvoicePrinter {
    InvoiceTestSummarizer invoiceTestSummarizer = new InvoiceTestSummarizer();


    public void printInvoice(Invoice invoice) {
        System.out.println(invoiceTestSummarizer.getSummary(invoice));
    }
}
