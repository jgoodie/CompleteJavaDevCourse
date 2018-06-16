package com.jgoodie;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int min = -10000;
        int max = 10000;
        Random rand = new Random();
        int levelCompleted = 5;
        int bonus = 100;
        int counter = 0;
        boolean gameOver = true;
        while (counter <= 100) {
            int score = rand.nextInt((max - min) + 1) + min;
            int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
            displayHighScorePosition("John", calculateHighScorePosition(highScore));
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

    private static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " is in position " + position);
    }

    private static int calculateHighScorePosition(int highScore){
        int position;
        if(highScore >= 1000){
           position = 1;
        }
        else if((highScore < 1000) && (highScore >=500)) {
            position = 2;
        }
        else if((highScore<500)&&(highScore>=100)){
            position = 3;
        }
        else {
            position = 4;
        }
        return (position);
    }
}