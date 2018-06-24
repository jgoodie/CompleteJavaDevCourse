package com.jgoodie;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	    printSquareStar(10);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){ //rows: i is the rows
            for (int j=1; j <= number; j++){ //columns: j is the columns
                if((j==1)||(j==number)||(i==1)||(i==number)||(i==j)||(j == number -i +1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
