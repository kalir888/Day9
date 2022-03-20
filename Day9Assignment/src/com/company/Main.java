package com.company;

import java.util.Random;

public class Main {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        Random random = new Random();
        int attendance = Math.abs(random.nextInt()%3);
        int dailyEmpWage;

        switch(attendance) {
            case IS_FULL_TIME:
                dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Daily Employee Wage is = " + dailyEmpWage);
                break;
            case IS_PART_TIME:
                dailyEmpWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                System.out.println("Daily Employee Wage is = " + dailyEmpWage);
                break;
            default:
                System.out.println("Employee is absent");
                break;
        }
    }
}
