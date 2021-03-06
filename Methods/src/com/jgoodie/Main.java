package com.jgoodie;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int min = -5000;
        int max = 5000;
        Random rand = new Random();
        int levelCompleted = 5;
        int bonus = 100;
        int counter = 0;
        boolean gameOver = true;
        while (counter <= 100) {
            int score = rand.nextInt((max - min) + 1) + min;
            int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
            displayHighScorePosition("John", calculateHighScorePosition(highScore), score);
            counter++;
        }
    }

    // can't put a method/function with in another method/function
    // also don't want to put it outside the public class definition
    // NOTE: use void if you don't want to return anything. Sound familiar? C++?
    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            //int finalScore = score + (levelCompleted * bonus);
            return (score + (levelCompleted * bonus));
        } // note: you can't access finalScore outside of this code block. This is scope. Remember that?
        else {
            return (-1);
        }

    }

    private static void displayHighScorePosition(String playerName, int position, int score){
        System.out.println(playerName + " is in position " + position +
        " with score: " + score);
    }

    private static int calculateHighScorePosition(int highScore){
        int position;
        if(highScore >= 1000){
           position = 1;
        }
        else if(highScore >=500) { // can remove (highScore < 1000) since previous satisfies it implicitly
            position = 2;
        }
        else if(highScore>=100){ // can remove (highScore<500) since previous satisfies it implicitly.
            position = 3; // Personally I like to add those conditions because it's very explicit
        }
        else {
            position = 4;
        }
        return (position);
    }
}