package com.Tutorial;

// KELAS TURUNAN UNTUK KEYWORD SUPER 
class VicePresident extends Manager{
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Manager name is " + this.name);
    }

    int getSalary(){
        return 200000;
    }

    // Memanggil getSalary() dari kelas induk, karena memkai super constructor
    int getParentSalary(){
        return super.getSalary();
    }

    VicePresident(String name){
        super(name, null);
    }

    VicePresident(){
        super(null);
    }
}

