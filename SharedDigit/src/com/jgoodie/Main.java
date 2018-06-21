package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if ((n1<10)||(n1>99)||(n2<10)||(n2>99)){
            return false;
        }
        int n1val1 = 0;
        int n1val2 = 0;
        int n2val1 = 0;
        int n2val2 = 0;
        for (int i=1; i<=2; i++) {
            if(i == 1){
                n1val1 = n1%10;
                n2val1 = n2%10;
            }
            else{
                n1val2 = n1;
                n2val2 = n2;
            }
            n1 /= 10;
            n2 /= 10;
        }
        if((n1val1 == n2val1) || (n1val2 == n2val2) || (n1val1 == n2val2) || (n1val2 == n2val1)){
            return true;
        }
        else{
            return false;
        }
    }
}
