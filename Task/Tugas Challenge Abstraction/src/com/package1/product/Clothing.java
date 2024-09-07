package com.package1.product;

public class Clothing extends ProductForSale {
    private String size;

    public Clothing(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Clothing: " + super.getDescription());
        System.out.println("Size: " + size);
        System.out.println("Price: " + getPrice());
    }
}
