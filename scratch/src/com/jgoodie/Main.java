package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        recurse(20);
    }
    private static int recurse(int val){
        if (val <= 0){
            return val;
        }
        else {
            System.out.println(val);
            val--;
            return recurse(val);
        }

    }
}
