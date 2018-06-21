package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(-101));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        if (number < 0){
            number = number*-1;
        }
        int length = String.valueOf(number).length();
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        for (int i = 1; i <= length; i++){
            lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }
        if (reverse == number){
            return true;
        }
        else {
            return false;
        }
    }
}
