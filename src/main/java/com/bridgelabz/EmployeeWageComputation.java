package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Calculate Wages till a condition");
        int isPresent = 1, monthlyWage , totalHr = 0;
        int isFullTime = 1, isPartTime = 0, dayPresent = 0, empHr;

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

        for (int i=1; i<=31; i++) {
            int empStatus = (int) (Math.random() * 10) % 2;
            if (empStatus == isPresent) {
                if (dayPresent < 20 && totalHr < 100) {
                    dayPresent = dayPresent + 1;
                    totalHr = totalHr + empHr;
                }
            }
        }
        System.out.println("working day : "+dayPresent);
        System.out.println("total hours worked : "+totalHr);
        monthlyWage = totalHr * 20;
        System.out.println("monthly salary is : "+monthlyWage);
    }
}
