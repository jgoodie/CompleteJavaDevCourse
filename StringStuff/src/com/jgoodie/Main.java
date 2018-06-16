package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// strings
        String myString = "This is my string";
        System.out.println(myString);
        myString = myString + ". I added this string to myString. \u00A9 2018";
        System.out.println(myString);
        String numString = "255.255.";
        numString = numString + "248.0";
        System.out.println(numString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("String + int " + lastString); //converts int to string
        double doubleNum = 10.256;
        lastString = lastString + doubleNum;
        System.out.println("String + int + double " + lastString);
    }
}
