package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent = 1;
        int empCheck = (int) (Math.random() * 10) % 2;

        if (empCheck == isPresent) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
