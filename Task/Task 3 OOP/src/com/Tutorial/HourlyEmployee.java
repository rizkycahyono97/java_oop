package com.Tutorial;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay() {
        return 8 * 5 * 52 / 12.0 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee {hourlyPayRate=%.2f}\n%s", hourlyPayRate, super.toString());
    }
}
