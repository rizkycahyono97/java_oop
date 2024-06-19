package com.Tutorial;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Department: " + department);
    }
}


