package com.bridgelabz.oops.EmpWage;

public class EmployeeWageForCompanies {
    static final int isFullTime = 1;
    static final int isPartTime = 0;
    private int workingDays, wagePerHr, workingHrsPerMonth;
    private String company;

    public EmployeeWageForCompanies(String company, int workingDays, int wagePerHr, int workingHrsPerMonth) {
        this.company = company;
        this.workingDays = workingDays;
        this.wagePerHr = wagePerHr;
        this.workingHrsPerMonth = workingHrsPerMonth;
    }

    public int companyWage() {
        int empHrs;
        while (workingDays < 0 && workingHrsPerMonth < 0) {
                int empCheck = (int) (Math.random() * 10) % 3;
                if (empCheck == isFullTime)
                    empHrs = 8;
                else if (empCheck == isPartTime)
                    empHrs = 4;
                else
                    empHrs = 0;
                workingDays = workingDays + 1;
                workingHrsPerMonth = workingHrsPerMonth + empHrs;
        }
        int empWage = workingHrsPerMonth * wagePerHr;
        return empWage;
    }

    public static void main(String[] args) {
        EmployeeWageForCompanies dmart = new EmployeeWageForCompanies("Dmart",30,6,150);
        EmployeeWageForCompanies reliance = new EmployeeWageForCompanies("Reliance",20,6,180);
        System.out.println("Employee wage for Dmart is : " +dmart.companyWage());
        System.out.println("Employee wage for Reliance is : " +reliance.companyWage());
    }
}
