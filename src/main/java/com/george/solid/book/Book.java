package com.george.solid.book;

public class Book {
    private String name;
    private String authorName;
    private int year;
    private int price;
    private String isbn;

    private Book(String name, String authorName, int year, int price, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }


    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }


    public static final class BookBuilder {
        private String name;
        private String authorName;
        private int year;
        private int price;
        private String isbn;

        private BookBuilder() {
        }

        public static BookBuilder aBook() {
            return new BookBuilder();
        }

        public BookBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder withAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookBuilder withYear(int year) {
            this.year = year;
            return this;
        }

        public BookBuilder withPrice(int price) {
            this.price = price;
            return this;
        }

        public BookBuilder withIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Book build() {
            return new Book(name, authorName, year, price, isbn);
        }
    }
}
