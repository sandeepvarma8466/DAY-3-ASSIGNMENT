package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Calculate Daily Employee Wage");
        int isPresent = 1, empHrs = 8, empWage, empRatePerHr = 20;
        int empCheck = (int) (Math.random() * 10) % 2;

        if (empCheck == isPresent) {
            System.out.println("Employee is Present");
            empWage = empHrs * empRatePerHr;
            System.out.println(empWage);
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
