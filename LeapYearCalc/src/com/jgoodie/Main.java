package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        boolean rtVal = false;
        if((year >= 1) && (year <= 9999)){
            if((year%4 == 0) && (year%100 != 0) || (year%400==0)) {
                rtVal = true;
            }
        }
        else {
            rtVal = false;
        }
        return rtVal;
    }
}
