package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    printFactors(10);
    }
    public static void printFactors(int val){
        if(val < 0){
            System.out.println("Invalid Value");
        }
        for(int i=1; i<=val; i++){
            if(val%i == 0){
                System.out.println(i);
            }
        }
    }
}
