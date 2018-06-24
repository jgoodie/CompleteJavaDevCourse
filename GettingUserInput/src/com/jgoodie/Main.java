package com.jgoodie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // scanner is a builtin class that allows us to read user input
        Scanner scanner = new Scanner(System.in); //new -> create a new object of type scanner
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close(); // like in python you need to close your file/input handle
        System.out.println("Thank you, " + name);
    }
}
