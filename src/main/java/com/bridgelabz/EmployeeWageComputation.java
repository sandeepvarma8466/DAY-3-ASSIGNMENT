package com.bridgelabz;

public class EmployeeWageComputation {
    static final int isFullTime = 1;
    static final int isPartTime = 0;
    static final int empRatePerHr = 20;

    public static void main(String[] args) {
        System.out.println(" Check isPartTime/FullTime Using Switch Case");
        int empHrs = 0, empWage;

        int empCheck = (int) (Math.random() * 10) % 3;
        switch (empCheck) {
            case isFullTime:
                empHrs = 8;
                break;
            case isPartTime:
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }
        empWage = empHrs * empRatePerHr;
        System.out.println("Employee wage : "+empWage);
    }
}
