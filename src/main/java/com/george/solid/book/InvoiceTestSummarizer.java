package com.george.solid.book;

public class InvoiceTestSummarizer {

    public String getSummary(Invoice invoice) {
        return invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getName() + "$/n" +
                "Discount Rate: " + invoice.getDiscountRate() + "/n" +
                "Tax Rate: " + invoice.getTaxRate() + "/n" +
                "Total: " + invoice.getTotal() + "/n";
    }

}
