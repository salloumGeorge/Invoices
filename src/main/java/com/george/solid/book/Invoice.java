package com.george.solid.book;

public class Invoice {

    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }


    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }


    public static final class InvoiceBuilder {
        private Book book;
        private int quantity;
        private double discountRate;
        private double taxRate;

        private InvoiceBuilder() {
        }

        public static InvoiceBuilder anInvoice() {
            return new InvoiceBuilder();
        }

        public InvoiceBuilder withBook(Book book) {
            this.book = book;
            return this;
        }

        public InvoiceBuilder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public InvoiceBuilder withDiscountRate(double discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public InvoiceBuilder withTaxRate(double taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        public Invoice build() {
            return new Invoice(book, quantity, discountRate, taxRate);
        }
    }
}
