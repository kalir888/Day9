package com.employeewage;

import java.util.Random;

public class EmployeeWage {
    public final String companyName;
    private final int WAGE_PER_HOUR;
    private final int FULL_DAY_HOUR;
    private final int PART_DAY_HOUR;
    private final int MAX_WORK_DAYS;
    private final int MAX_WORK_HOURS;
    private static int empWagePerMonth;

    public EmployeeWage(String companyName,int WAGE_PER_HOUR,int FULL_DAY_HOUR,int PART_DAY_HOUR,int MAX_WORK_DAYS,int MAX_WORK_HOURS){
        this.companyName = companyName;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.FULL_DAY_HOUR = FULL_DAY_HOUR;
        this.PART_DAY_HOUR = PART_DAY_HOUR;
        this.MAX_WORK_DAYS = MAX_WORK_DAYS;
        this.MAX_WORK_HOURS = MAX_WORK_HOURS;
    }

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
