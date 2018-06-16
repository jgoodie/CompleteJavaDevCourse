package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double myVar = 2;
        int counter = 0;
        while (counter <= 10) {
            System.out.println(counter +
                    " " +
                    myVar);
            myVar = myVar * 2;
            counter++;

        }

        int myVar2 = 10; int mvVar3 = 20; // can put statements on a single line

        // you should know by now that indenting is just good manners
        System.out.println("you should know by now that indenting is just good manners");
    }
}
