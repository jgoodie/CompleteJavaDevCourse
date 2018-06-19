package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1052100);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        // 1 hour = 60 mins
        // 1 day = 24 hours
        // 1 year = 365 days
        // print message: "XX min = YY y and ZZ d"
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
           long days = (minutes/60)/24;
           long remainderDays = days%365;
           long years = days/365;
           System.out.println(minutes + " min = " + years +
           " y and " + remainderDays + " d" );
        }
    }
}
