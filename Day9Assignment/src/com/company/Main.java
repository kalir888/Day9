package com.company;


import java.util.Random;


public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage employeeWage = new EmployeeWage();
        int employee1Wage = employeeWage.calculate();

        System.out.println("Employee1 Wage per month = " + employee1Wage);
    }
}
