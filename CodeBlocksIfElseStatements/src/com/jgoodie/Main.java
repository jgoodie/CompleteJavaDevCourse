package com.jgoodie;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int min = 0;
        int max = 10000;
        int levelCompleted = 5;
        int bonus = 100;
        Random rand = new Random();
        int score = 0;
        int counter = 0;
        while (counter <= 100) {
            score = rand.nextInt((max - min) + 1) + min;
            if (score < 5000) {
                System.out.println("Your score is less than 5000: " + score); // if just a single if statement you can leave out the braces
            } // best to keep the braces to be explicit
            else {
                System.out.println("Your score is greater or equal to 5000: " + score);
            }
            counter++;
        }
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score: " + finalScore);
        }
    }
}
