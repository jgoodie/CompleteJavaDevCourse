package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if ((n1 <10) || (n2<10) || (n3<10) || (n1>1000) || (n2>1000) || (n3>1000)){
            return false;
        }
        n1 = n1%10;
        n2 = n2%10;
        n3 = n3%10;
        if ((n1 == n2) || (n1 == n3) || (n2 == n3)){
            return true;
        }
        else{
            return false;
        }
    }
}
