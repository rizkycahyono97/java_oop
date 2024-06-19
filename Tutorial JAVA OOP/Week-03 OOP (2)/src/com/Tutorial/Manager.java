package com.Tutorial;

class Manager {
    String name;
    String company;

    // constructor
    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    Manager(String name){
        this.name = name;
    }

    Manager(){

    }

    void sayHello(String name) throws Exception {
        System.out.println("Hello " + name + ", My Manager name is " + this.name);
    }
} 
