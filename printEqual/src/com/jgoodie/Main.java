package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static void printEqual(int x, int y, int z){
        if ((x == y) && (x == z) && (y == z)) {
            System.out.println("All numbers are equal");
        }
        else if ((x != y) && (x != z) && (y != z)){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
