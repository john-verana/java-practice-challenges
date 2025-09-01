package com.inheritance.main;

import java.util.Scanner;
import com.inheritance.fulltimeemployee.FullTimeEmployee;
import com.inheritance.parttimeemployee.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Full-Time Employee
        System.out.println("Enter Full Time Employee details");
        System.out.print("Enter your Name: ");
        String ftName = input.nextLine();
        System.out.print("Enter your Employee ID: ");
        int ftId = input.nextInt();
        System.out.print("Enter your Base Salary: ");
        double ftSalary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Benefits: ");
        String benefits = input.nextLine();

        FullTimeEmployee emp1 = new FullTimeEmployee(ftName, ftId, ftSalary, benefits);

        // Part-Time Employee
        System.out.println("\nEnter Part Time Employee details");
        System.out.print("Enter your Name: ");
        String ptName = input.nextLine();
        System.out.print("Enter your Employee ID: ");
        int ptId = input.nextInt();
        System.out.print("Enter your Hourly Rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter your Hours Worked: ");
        int hoursWorked = input.nextInt();

        PartTimeEmployee emp2 = new PartTimeEmployee(ptName, ptId, hourlyRate, hoursWorked);

        System.out.println("\n---- Full Time Employee ----");
        emp1.getDetails();
        emp1.calculateAnnualSalary();

        System.out.println("\n---- Part Time Employee ----");
        emp2.getDetails();
        emp2.calculateMonthlyPay();

        input.close();
    }
}
