package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int number){
        boolean isNeg = false;
        if(number<0){
            isNeg = true;
            number *= -1;
        }
        int length = getDigitCount(number);
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        for (int i = 1; i <= length; i++){
            lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }
        if(isNeg){
            return reverse*-1;
        }
        else {
            return reverse;
        }
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        return String.valueOf(number).length();
    }

    public static void numberToWords(int number){

    }

}
