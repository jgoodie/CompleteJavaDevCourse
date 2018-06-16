package com.jgoodie;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int min = 0;
        int max = 10000;
        Random rand = new Random();
        int levelCompleted = 5;
        int bonus = 100;
        int counter = 0;
        boolean gameOver = true;
        while (counter <= 100) {
            int score = rand.nextInt((max - min) + 1) + min;
            if (score < 5000) {
                calculateScore(gameOver, score, levelCompleted, bonus);
            }
            else {
                calculateScore(gameOver, score, levelCompleted, bonus);
            }
            counter++;
        }

    }

    // can't put a method/function with in another method/function
    // also don't want to put it outside the public class definition
    private static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score: " + finalScore);
        } // note: you can't access finalScore outside of this code block. This is scope. Remember that?

    }
}