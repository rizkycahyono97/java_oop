package com.Tutorial;

import com.Tutorial.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Iphone", 15000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
