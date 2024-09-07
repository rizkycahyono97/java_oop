package com.package1.product;

// Abstrak Class
public abstract class ProductForSale {
    // Fields
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Method konkret
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // Method konkret
    public void printPricedItem(int quantity) {
        System.out.println(quantity + " X " + type + " at $" + price + " each = $" + getSalesPrice(quantity));
    }

    // method abstrak
    public abstract void showDetails();

    // Getter
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
