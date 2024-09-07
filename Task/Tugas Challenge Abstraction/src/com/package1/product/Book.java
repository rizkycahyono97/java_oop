package com.package1.product;

public class Book extends ProductForSale {
    private String author;

    // Constructor
    public Book(String type, double price, String description, String author) {
        super(type, price, description);
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + super.getDescription());
        System.out.println("Author: " + author);
        System.out.println("Price: $" + super.getPrice());
    }
}
