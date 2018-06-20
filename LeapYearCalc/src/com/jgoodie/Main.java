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
    public static int getDaysInMonth(int month, int year) {
        if((month < 1) || (month > 12)){
            return -1;
        }
        if ((year < 1) || (year > 9999)){
            return -1;
        }
        boolean leapYear = isLeapYear(year);
        switch (month){
            case 1:
                return 31;
                break;
            case 2:
                if (leapYear == true){
                    return 29;
                }
                else {
                    return 28;
                }
                break;
            case 3:
                return 31;
                break;
            case 4:
                return 30;
                break;
            case 5:
                return 31;
                break;
            case 6:
                return 30;
                break;
            case 7:
                return 31;
                break;
            case 8:
                return 31;
                break;
            case 9:
                return 30;
                break;
            case 10:
                return 31;
                break;
            case 11:
                return 30;
                break;
            case 12:
                return 31;
                break;
        }
    }
}
