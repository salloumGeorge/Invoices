package com.george.solid.book.output;

import com.george.solid.book.Invoice;
import com.george.solid.book.InvoiceTestSummarizer;

public class InvoicePrinter {
    InvoiceTestSummarizer invoiceTestSummarizer;

    public InvoicePrinter(InvoiceTestSummarizer invoiceTestSummarizer) {
        this.invoiceTestSummarizer = invoiceTestSummarizer;
    }

    public void printInvoice(Invoice invoice) {
        System.out.println(invoiceTestSummarizer.getSummary(invoice));
    }
}
