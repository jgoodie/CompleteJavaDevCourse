package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1251));
        System.out.println(sumDigits(2345));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int n){
        if (n < 10){
            return -1;
        }
        int length = String.valueOf(n).length();
        int sum = 0;
        for(int i = 1; i <= length; i++){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
