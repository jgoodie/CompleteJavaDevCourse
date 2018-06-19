package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// don't forget the break as it's important
        int value = 7;
        switch (value){
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                break;
            case 3:
                System.out.println("value = 3");
                break;
            case 4: case 5: case 6:
                System.out.println("not a 4, 5, or 6");
            default:
                System.out.println("not 1 - 6");
                break;
        }

        char foo = 'E';
        switch (foo){
            case 'A':
                System.out.println("Found an A");
                break;
            case 'B':
                System.out.println("Found an B");
                break;
            case 'C':
                System.out.println("Found an C");
                break;
            case 'D':
                System.out.println("Found an D");
                break;
            case 'E':
                System.out.println("Found an E");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
