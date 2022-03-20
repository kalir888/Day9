package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;
        Random random = new Random();
        int attendance = random.nextInt()%2;

        if (attendance == IS_PRESENT)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
