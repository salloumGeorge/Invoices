package com.george.solid.output;

import com.george.solid.book.Invoice;

public class InvoicePrinter {

    public void printsInvoice(Invoice invoice) {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getPrice() + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }


}
