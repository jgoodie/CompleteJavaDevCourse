package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int val1, int val2, int val3){
        if((val1 >= 13) && (val1 <= 19)){
            return true;
        }
        else if((val2 >= 13) && (val2 <= 19)) {
            return true;
        }
        else if((val3 >= 13) && (val3 <= 19)){
            return true;
        }
        else {
            return false;
        }
    }
}
