package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,6,8));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        // bigCount is count of 5kg flour bags
        // smallCount is count of 1kg flour bags
        // goal is the amount of flour (kg) needed to assemble a package
        // bigCount*5kg + smallCount*1kg = goal
        if ((bigCount<0) || (smallCount<0) || (goal<0)){
            return false;
        }
        return smallCount >= (goal - (Math.min(goal / 5, bigCount) * 5));
    }
}
