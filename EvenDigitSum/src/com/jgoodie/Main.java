package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static boolean isEven(int number){
        if (number <= 0){
            return false;
        }
        if (number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int length = String.valueOf(number).length();
        int evenSum = 0;
        for(int i = 1; i <=length; i++){
            if(isEven(number%10)){
                evenSum += number%10;
            }
            number /= 10;
        }
        return evenSum;

    }
}
