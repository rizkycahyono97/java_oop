package com.package1.product;

public class Electronic extends ProductForSale {
    private String brand;

    // Constructor
    public Electronic(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Electronics: " + super.getDescription());
        System.out.println("Brand: " + brand);
        System.out.println("PRice: " + getPrice());
    }
}
