package com.jgoodie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int inputCount = 1;
	    int sum = 0;
	    int number = 0;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);
        while (inputCount < 11){
        //while (true){
            System.out.println("Enter number #" + inputCount);
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                inputCount++;
                sum += number;
//                if(inputCount >= 11){
//                    break;
//                }
            }
            else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle eol enter key
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
