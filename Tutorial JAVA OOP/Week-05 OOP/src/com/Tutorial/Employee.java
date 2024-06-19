package com.Tutorial;

public class Employee {
    private String name;

    public Employee(String name, double salary) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello "+ name+ ", My Name is employee "+ this.name);
    }
}

