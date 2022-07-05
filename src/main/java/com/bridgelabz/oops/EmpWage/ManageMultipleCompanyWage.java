package com.bridgelabz.oops.EmpWage;

class CompanyEmpWage {
    public String companyName;
    public int workingDays ;

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", workingDays=" + workingDays +
                ", workingHrPerMonth=" + workingHrPerMonth +
                ", wagePerHr=" + wagePerHr +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

    public int workingHrPerMonth ;
    public int wagePerHr;
    public int totalEmpWage;

    CompanyEmpWage(String CompanyName,int wagePerHr, int workingDays, int workingHrPerMonth ){
        this.companyName=CompanyName;
        this.workingDays=workingDays;
        this.wagePerHr=wagePerHr;
        this.workingHrPerMonth=workingHrPerMonth;
    }

    public void setTotalEmpWage(int empWage) {
        this.totalEmpWage=empWage;
    }

}
public class ManageMultipleCompanyWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 0;

    private int noOfCompany=0;
    private CompanyEmpWage[] comEmpWagearr=new CompanyEmpWage[5];

    private void addCompanyEmpWage(String CompanyName,int wagePerHr, int workingDays, int workingHrPerMonth) {
        comEmpWagearr[noOfCompany]=new CompanyEmpWage(CompanyName,wagePerHr,workingDays,workingHrPerMonth);
        noOfCompany++;
    }
    private void computeEmpWage() {
        int i;
        for(i = 0 ; i < noOfCompany ; i++) {
            comEmpWagearr[i].setTotalEmpWage(this.companyWage(comEmpWagearr[i]));
            System.out.println(comEmpWagearr[i]);
        }
    }
    public int companyWage(CompanyEmpWage a){
        int empHour = 0;
        int workingHrPerMonth=0;
        int workingDays=0;
        int wagePerHr=0;
        int empCheck,empWage;
        while (workingDays < 0 && workingHrPerMonth<0) {
            empCheck = (int) (Math.random() * 10) % 3;
            if(empCheck==isFullTime)
                empHour=8;
            else if(empCheck==isPartTime)
                empHour=4;
            else
                empHour=0;
            workingDays += 1;
            workingHrPerMonth += empHour;
        }
        empWage = workingHrPerMonth * wagePerHr;
        return empWage;
    }

    public static void main(String[] args) {
        ManageMultipleCompanyWage a=new ManageMultipleCompanyWage();
        a.addCompanyEmpWage("D-mart", 20, 6, 120);
        a.addCompanyEmpWage("Reliance", 20, 7, 150);
        a.computeEmpWage();

    }


}
