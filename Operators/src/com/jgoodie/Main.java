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
        // result *= 10
        // result /= 10
        // result -= 10
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
        result--;
        System.out.println("result++ " + result);

        int topScore = 100;
        int secondTopScore = 81;

        if ((topScore > secondTopScore) && (topScore < 101) ){
            System.out.println("Top Score greater that Second Score and less that 101");
        }
        if((topScore >90) || (secondTopScore <= 90)) {
            System.out.println("Sup? from the or condition");
        }

        int newVal = 50;
        if (newVal == 50) {
            System.out.println("newVal is equal to 50");
        }
        boolean isCar = false;
        if (isCar == true){
            System.out.println("this will never happen");
        }
        //isCar = true;
        // if isCar is true, return true, else false
        boolean wasCar = isCar ? true : false;

        // test it
        if(wasCar){
            System.out.println("wasCar is true");
        }
        double myVar1 = 20;
        double myVar2 = 80;
        double myVar3 = (myVar1 + myVar2) * 25;
        if ((myVar3%40) <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
