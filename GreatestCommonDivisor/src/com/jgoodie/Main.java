package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int val1, int val2){
        if((val1 <10) || (val2<10)){
            return -1;
        }
        int div = 0;
        if (val1 > val2){
            for(int i=1; i<=val1; i++){
                if((val1%i == 0) && ( val2%i == 0)){
                    div = i;
                }
            }
        }
        else {
            for(int i=1; i<=val2; i++){
                if((val1%i == 0) && ( val2%i == 0)){
                    div = i;
                }
            }
        }
        return div;

    }
}
