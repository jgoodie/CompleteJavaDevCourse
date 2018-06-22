package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        if(number <= 0){
            return false;
        }
        int perfectSum = 0;
        for(int i=1; i<number; i++){
            if(number%i == 0){
                perfectSum += i;
            }
        }
        if(perfectSum == number){
            return true;
        }
        else {
            return false;
        }
    }
}
