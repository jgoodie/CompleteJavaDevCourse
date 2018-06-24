package com.jgoodie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int min = 0;
	    int max = 0;
        int number =0;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number: ");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                if((min == 0) && ( max == 0)){ // this is only set on the first number
                    min = number;
                    max = number;
                }
                if ((number >= max) && (number > min)){
                    max = number;
                }
                if((number < max) && (number <= min) ){
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        scanner.close();
    }
}
