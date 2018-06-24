package com.jgoodie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // scanner is a builtin class that allows us to read user input
        Scanner scanner = new Scanner(System.in); //new -> create a new object of type scanner
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // check to see if input is an int
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // by entering the int above you are forced to hit enter which trips up the name input
            System.out.println("Enter your name: "); // the scanner.nextLine() above fixes this.
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if ((age>0) && (age <= 122)){
                System.out.println("Thank you, " + name + ". You are " + age + " years old.");
            }
            else {
                System.out.println("Invalid Year Of Birth");
            }
        }
        else {
            System.out.println("Unable to parse Year Of Birth");
        }

        scanner.close(); // like in python you need to close your file/input handle

    }
}
