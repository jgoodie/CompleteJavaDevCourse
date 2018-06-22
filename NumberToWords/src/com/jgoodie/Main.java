package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        numberToWords(-12);
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
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int numLen = getDigitCount(number);
        int revNum = reverse(number);
        int forwardNum = 0;
        for(int i=1; i<=numLen; i++){
            //System.out.println(revNum%10);
            switch (revNum%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            revNum /=10;
        }

    }
}
