package com.employeewage;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage cms = new EmployeeWage("CMS",40,8,4,26,150);
        EmployeeWage sipl = new EmployeeWage("SIPL",50,8,4,26,150);
        int employee1Wage = cms.calculate();
        int employee2Wage = sipl.calculate();

        System.out.println("EmployeeWagePerMonth for company "+cms.companyName+" = " + employee1Wage);
        System.out.println("EmployeeWagePerMonth for company "+sipl.companyName+" = " + employee2Wage);
    }
}
