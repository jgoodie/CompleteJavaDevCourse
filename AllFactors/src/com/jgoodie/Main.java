package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    printFacotrs(10);
    }
    public static void printFacotrs(int val){
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
