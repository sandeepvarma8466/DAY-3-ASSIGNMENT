package com.bridgelabz;

public class EmployeeWageComputation {
    static final int isFullTime = 1;
    static final int isPartTime = 0;
    static final int empRatePerHr = 20;

    public static void main(String[] args) {
        System.out.println("Calculate Wages for a month");
        int isFullTime = 1;
        int empRatePerHr = 20;
        int isPartTime = 0;
        int empHr = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day=1; day<=20; day++) {
            int empCheck = (int) (Math.random() * 10) % 3;

            if (empCheck == isFullTime) {
                empHr = 8;
            }
            else if (empCheck == isPartTime) {
                empHr = 4;
            }
            else {
                empHr = 0;
            }
            empWage = empHr * empRatePerHr;
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Employee wage for month : "+totalEmpWage);
    }
}
