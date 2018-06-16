package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("Current val of result: " + result);
        int previousResult = result;
        result = result*result;
        System.out.println("Current val of result: " + result);
        result = result * 3;
        System.out.println(result/previousResult);
        System.out.println("Modulo " + result%previousResult);
        System.out.println("Current val of result: " + result);
        result++;
        System.out.println("result++ " + result);
        System.out.println("Current val of result: " + result);
        System.out.println("result += 2 " + (result += 2));
        boolean isAlien = false; //assignment vs conditional
        long systime = System.currentTimeMillis();
        if (systime%2 == 0) {
            isAlien = false;
        }
        else {
            isAlien = true;
        }
        if (isAlien == false) {
            System.out.println("Not an alien " + systime);
        }
        else {
            System.out.println("Found an Alien "+ systime);
        }

        if (systime%2 != 0){ //NOT EQUAL
            System.out.println("systime mod 2 != 0");
        }

        if (systime > 100){ // can do >< >= <=
            System.out.println("systime greater than 100");
        }

    }
}
