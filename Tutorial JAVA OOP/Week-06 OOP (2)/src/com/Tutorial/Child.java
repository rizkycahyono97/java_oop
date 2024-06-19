package com.Tutorial;

public class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("Do it Child");
        System.out.println("Parent name is "+ super.name);
    }
}
