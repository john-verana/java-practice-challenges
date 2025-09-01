package com.inheritance.employee;

public class Employee {
    //fields
    private String name;
    private int employeeId;
    private double baseSalary;

    //constructor
    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    //getters
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public double getBaseSalary() { return baseSalary; }

    //method
    public void getDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
