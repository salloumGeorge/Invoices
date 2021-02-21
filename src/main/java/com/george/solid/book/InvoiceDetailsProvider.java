package com.george.solid.book;

public class InvoiceDetailsProvider {

    public String getDetails(Invoice invoice) {
        return invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getName() + "$\n" +
                "Discount Rate: " + invoice.getDiscountRate() + "\n" +
                "Tax Rate: " + invoice.getTaxRate() + "\n" +
                "Total: " + invoice.getTotal() + "\n";
    }

}
