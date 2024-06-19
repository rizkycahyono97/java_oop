package com.Tutorial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false; // Initially not retired
    }

    public double collectPay() {
        if (isRetired) {
            return annualSalary * 0.3 / 12;
        } else {
            return annualSalary / 12;
        }
    }

    public void retire() {
        this.isRetired = true;
        terminate(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee {annualSalary=%.2f, isRetired=%b}\n%s", annualSalary, isRetired, super.toString());
    }
}

