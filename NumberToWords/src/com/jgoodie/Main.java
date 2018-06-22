package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int number){
        int length = getDigitCount(number);
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        for (int i = 1; i <= length; i++){
            lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        return String.valueOf(number).length();
    }

}
