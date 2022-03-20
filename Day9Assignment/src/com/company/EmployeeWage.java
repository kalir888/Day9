package com.company;

import java.util.Random;

public class EmployeeWage {
    private final int WAGE_PER_HOUR = 20;
    private final int FULL_DAY_HOUR = 8;
    private final int PART_DAY_HOUR = 4;
    private final int MAX_WORK_DAYS = 20;
    private final int MAX_WORK_HOURS = 100;
    private static int empWagePerMonth;

    public int calculate(){
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int dailyEmpHours;
        int empHoursPerMonth = 0;
        int days = 1;

        Random random = new Random();

        while(days <= MAX_WORK_DAYS & empHoursPerMonth <= MAX_WORK_HOURS){

            int attendance = Math.abs(random.nextInt()%3);

            switch(attendance) {
                case IS_FULL_TIME:
                    dailyEmpHours = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    dailyEmpHours = PART_DAY_HOUR;
                    break;
                default:
                    dailyEmpHours = 0;
                    break;
            }
            empHoursPerMonth += dailyEmpHours;
            days++;
        }
        empWagePerMonth = empHoursPerMonth * WAGE_PER_HOUR;
        return empWagePerMonth;
    }
}
