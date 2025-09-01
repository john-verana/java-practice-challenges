package com.inheritance.fulltimeemployee;

import com.inheritance.employee.Employee;

public class FullTimeEmployee extends Employee {
    private String benefits;

    //constructor
    public FullTimeEmployee(String name, int employeeId, double baseSalary, String benefits) {
        super(name, employeeId, baseSalary);
        this.benefits = benefits;
    }

    //method
    public void calculateAnnualSalary() {
        System.out.println("Annual Salary: " + (getBaseSalary() * 12));
        System.out.println("Benefits: " + benefits);
    }
}
