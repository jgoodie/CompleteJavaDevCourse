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

        char foo = 'D';
        switch (foo){
            case 'A':
                System.out.println("Found an " + foo);
                break;
            case 'B':
                System.out.println("Found a " + foo);
                break;
            case 'C':
                System.out.println("Found a " + foo);
                break;
            case 'D':
                System.out.println("Found a " + foo);
                break;
            case 'E':
                System.out.println("Found a " + foo);
                break;
            default:
                System.out.println("Default case");
                break;
        }

        String bar = "foobar";
        switch (bar){
            case "hello":
                System.out.println(bar);
                break;
            case "foo":
                System.out.println(bar);
                break;
            case "bar":
                System.out.println(bar);
                break;
            default:
                System.out.println("I don't know");
                break;
        }
    }
}
