package com.Tutorial;

public class PolymorphismApp {
    public static void main(String[] args) {
        // Contoh penggunaan polimorfisme
        Employee emp1 = new Manager("John Doe", 5000, "Sales");
        Employee emp2 = new VicePresident("Jane Smith", 10000, "Marketing");

        // Memanggil metode displayInfo() pada objek Employee
        emp1.sayHello();
        System.out.println("-----------+++-------");
        emp2.sayHello();
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            System.out.println("Hello VP " + ((VicePresident) employee).getName());
        } else if (employee instanceof Manager){
            System.out.println("Hello Manager " + ((Manager) employee).getName());
        } else {
            System.out.println("Hello " + employee.getName());
        }
    }    
}

