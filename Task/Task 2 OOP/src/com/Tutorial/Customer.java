package com.Tutorial;

public class Customer {
    String name;
    double creditLimit;
    String email;

    // Constructor
    public Customer(){
        this("Abdillah", 2000, "Abdillah@mail.com");
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Method
    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public double getCreditLimit(){
        return creditLimit;
    }
}
