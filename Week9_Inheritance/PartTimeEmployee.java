package com.inheritance.parttimeemployee;

import com.inheritance.employee.Employee;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    //constructor
    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //method
    public void calculateMonthlyPay() {
        System.out.println("Monthly Pay: " + (getBaseSalary() * hoursWorked));
    }
}
