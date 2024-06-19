package com.Tutorial;

public class VicePresident extends Employee {
    private String division;

    public VicePresident(String name, double salary, String division) {
        super(name, salary);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Division: " + division);
    }
}


