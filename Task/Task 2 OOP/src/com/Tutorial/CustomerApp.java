package com.Tutorial;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Abdillah", 2000, "Abdillah@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getClass());

        Customer customer2 = new Customer("Hamzah", "hamzah@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());  

        System.out.println((customer2.creditLimit==1000?"Correct Constructor default CreditLimit":"Wrong Constructor default CreditLimit"));

        Customer customer3 = new Customer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());

        System.out.println((customer3.getName()=="default_name"?"Correct Constructor default Name":"Wrong Constructor default Name"));
        System.out.println((customer3.getEmail()=="default@mail.com"?"Correct Constructor default Email":"Wrong Constructor default Email"));
    }
}
