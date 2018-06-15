package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// chars and booleans
        // char has width of 16 (2 bytes)
        char myChar = 'j';
        boolean myBool = true;
        boolean isFemale = false;
        if (isFemale) {
            System.out.println("isFemale is True");
        } else {
            System.out.println("is not female");
        }

        //char reg = '®'; // this works
        char reg = '\u00AE';
        char copyrt = '\u00A9';
        System.out.println("Registered Symbol: " + reg);
        System.out.println("Copy right symbol: " + copyrt);
    }
}
