package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    String numAsString = "2018";
        System.out.println("numAsString = " + numAsString);
        int number = Integer.parseInt(numAsString);
        System.out.println("number = " + number);

        numAsString += 1;
        number += 1;
        System.out.println("numAsString +1 " + numAsString);
        System.out.println("number +1 " + number);

        numAsString = "2018.01";
        double num = Double.parseDouble(numAsString);
        System.out.println("string to double " + num);

    }

}
