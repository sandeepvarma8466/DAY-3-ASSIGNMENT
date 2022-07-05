package com.bridgelabz.oopsconcept;

public class EmployeeWageCon {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.method1();
    }
}

class Employee {
    int isFullTime = 1;
    int isPartTime = 0;
    int dayPresent = 0;
    int totalHrs = 0;
    int monthlyWage = 0;

    void method1() {
        int empHrs;
        for (int i=1; i<31; i++) {
            if (dayPresent < 20 && totalHrs <=100) {
                int empCheck = (int) (Math.random() * 10) % 3;
                if (empCheck == isFullTime)
                    empHrs = 8;
                else if (empCheck == isPartTime)
                    empHrs = 4;
                else
                    empHrs = 0;
                dayPresent = dayPresent + 1;
                totalHrs = totalHrs + empHrs;
            }
        }
        System.out.println("working days : " +dayPresent);
        System.out.println("Total hours worked : " +totalHrs);
        monthlyWage = totalHrs * dayPresent;
        System.out.println("Monthly salary is : " +monthlyWage);
    }
}