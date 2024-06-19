package com.Tutorial;

public class PolymorphismApp {
    public static void main(String[] args) {
        // Contoh penggunaan polimorfisme
        Employee emp1 = new Manager("John Doe", 5000, "Sales");
        Employee emp2 = new VicePresident("Jane Smith", 10000, "Marketing");

        // Memanggil metode displayInfo() pada objek Employee
        emp1.sayHello();
        System.out.println("--------------------");
        emp2.sayHello();
    }
}

