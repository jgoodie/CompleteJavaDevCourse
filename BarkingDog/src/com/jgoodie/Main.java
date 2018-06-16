package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

    }

    public static boolean bark(boolean barking, int hourOfDay){
        boolean rtVal;
        if ((hourOfDay < 0) || (hourOfDay > 23)){
            rtVal = false;
        }
        else if ((barking) && (hourOfDay < 8)) {
            rtVal = true;
        }
        else if ((barking) && (hourOfDay > 22)){
            rtVal = true;
        }
        else {
            rtVal = false;
        }

        return rtVal;
    }
}
