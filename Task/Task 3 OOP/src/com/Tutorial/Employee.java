package com.Tutorial;

public class Employee extends Worker {
    private static int employeeNo = 1;
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = employeeNo;
        employeeNo++;
    }

    @Override
    public String toString() {
        return String.format("Employee {employeeId=%d, hireDate='%s'}\n%s", employeeId, hireDate, super.toString());
    }
}

