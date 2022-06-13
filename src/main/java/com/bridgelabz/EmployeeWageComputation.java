package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println(" Check isPartTime/FullTime & Calculate Daily Employee Wage");
        int isFullTime = 1;
        int isPartTime = 0;
        int empHrs, empWage, empRatePerHr = 20;

        int empCheck = (int) (Math.random() * 10) % 3;

        if (empCheck == isFullTime) {
            empHrs = 8;
        }
        else if (empCheck == isPartTime) {
            empHrs = 4;
        }
        else {
            empHrs = 0;
        }
        empWage = empHrs * empRatePerHr;
        System.out.println("Employee wage : "+empWage);
    }
}
