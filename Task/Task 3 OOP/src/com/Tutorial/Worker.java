package com.Tutorial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDateParsed = LocalDate.parse(this.birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return currentDate.getYear() - birthDateParsed.getYear();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return String.format("Worker {name='%s', birthDate='%s', endDate='%s'}", name, birthDate, endDate);
    }
}
