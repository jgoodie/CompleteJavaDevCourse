package com.jgoodie;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        boolean r = areEqualByThreeDecimalPlaces(-3.175, -3.174);
        System.out.println(r);
    }

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2){
        val1 = val1*1000;
        val2 = val2*1000;
        int newVal1 =  (int) val1;
        int newVal2 =  (int) val2;
        System.out.println(newVal1 + " " + newVal2);
        if (newVal1 == newVal2){
          return true;
        }
        else
            return false;
    }
}
