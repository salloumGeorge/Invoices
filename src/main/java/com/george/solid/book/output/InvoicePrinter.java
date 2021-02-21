package com.george.solid.book.output;

import com.george.solid.book.Invoice;
import com.george.solid.book.InvoiceDetailsProvider;

public class InvoicePrinter {
    InvoiceDetailsProvider invoiceDetailsProvider = new InvoiceDetailsProvider();


    public void printInvoice(Invoice invoice) {
        System.out.println(invoiceDetailsProvider.getDetails(invoice));
    }
}
