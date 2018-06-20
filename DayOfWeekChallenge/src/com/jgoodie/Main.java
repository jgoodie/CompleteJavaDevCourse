package com.jgoodie;

public class Main {

    public static void main(String[] args) {

        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(3);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

    private static void printDayOfWeek(int day){
        if((day < 0 ) || (day > 6)){
            System.out.println("Invalid Day of Week");
        }
        else {
            switch (day){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("This should never happen");

            }
        }


    }
}
