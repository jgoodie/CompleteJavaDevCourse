package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(314159));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }
        int length = String.valueOf(number).length();
        if(length == 1){
            return(number+number);
        }
        int last = 0;
        int first = 0;
        int n = number;
        for(int i=1; i<length; i++){
            if(i==1){
                last = n%10;
            }
            n = n/10;
            if(length-1 == i){
                first = n%10;
            }
        }
        return first+last;
    }
}
