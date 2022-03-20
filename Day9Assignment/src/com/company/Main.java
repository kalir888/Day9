package com.company;

import java.util.Random;

public class Main {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;

        Random random = new Random();
        int attendance = Math.abs(random.nextInt()%2);
        int dailyEmpWage;

        if(attendance == IS_PRESENT) {
            dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Employee Wage is = " + dailyEmpWage);
        } else
            System.out.println("Employee is absent");
    }
}
