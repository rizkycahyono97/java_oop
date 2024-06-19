package com.Tutorial;

public class Account {
    String accountNumber;
    Double balance;
    String customerName; 
    String email;
    String phoneNumber;

    // Contructor
    Account(String accountNumber, Double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method-method
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Jumlah Balance setelah Deposit: " + this.balance);
    }

    public void withdraw(double amount){ 
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Jumlah withdrawal: " + amount);
            System.out.println("Nilai balance setelah withdrawal: " + this.balance);
        } else {
            System.out.println("Maaf, saldo tidak mencukupi untuk melakukan penarikan sebesar " + amount);
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
