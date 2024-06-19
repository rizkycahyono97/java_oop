package com.Tutorial;

// KELAS INDUK UNTUK KEYWORD SUPER 
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

    // Default Contructor, karna di vicepresident sudah ada, maka disini nggaku usah
    // Manager(){
    // }

    void sayHello(String name) throws Exception {
        System.out.println("Hello " + name + ", My Manager name is " + this.name);
    }

    int getSalary(){
        return 100000;
    }


} 
