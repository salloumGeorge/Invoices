package com.george.solid.book.output;

import com.george.solid.book.Invoice;

public class InvoicePrinter {

    public InvoicePrinter() {
    }

    public void printInvoice(Invoice invoice) {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getName() + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }
}
