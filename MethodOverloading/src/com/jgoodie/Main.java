package com.jgoodie;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Bob", 15);
//        System.out.println("Total score: " + newScore);
//        int unamedScore = calculateScore(42);
//        System.out.println("Unamed player has score: " + unamedScore);
//        int noPlayerName = calculateScore();
//        System.out.println("No player name, no score: " + noPlayerName);
        double cm = calcFeetAndInchesToCentimeters(5, 8);
        System.out.println(cm);
        double cm2 = calcFeetAndInchesToCentimeters(100);
        System.out.println(cm2);
    }
    //Method overloading
    // note that you can't change the return type: int to void
    // you can only change the parameters
//    private static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score*1000;
//    }
    // note they have the same name but but take in different parameters
//    private static int calculateScore(int score) {
//        System.out.println("Unamed player score: " + score);
//        return score*1000;
//    }
//    private static int calculateScore() {
//        System.out.println("No player name, no player score" );
//        return 0;
//    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        // check that feet is >= 0
        //check that inches is >=0 and <=12
        // 1 inch = 2.54cm
        if ((feet < 0) || (inches < 0) || ( inches > 12)){
            System.out.println("Invalid input");
            return -1;
        }
        else {
            // feet to inches
            double totalInches = inches + feet*12.0;
            return totalInches*2.54;
        }
    }
    private static double calcFeetAndInchesToCentimeters(double inches){
        // check that feet is >= 0
        //check that inches is >=0 and <=12
        // 1 inch = 2.54cm
        if (inches < 0){
            System.out.println("Invalid input");
            return -1;
        }
        else {
            return inches*2.54;
        }
    }

}
