package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// floating and double point numbers
        // width of in is 32 (4 bytes)
        int myIntVal =  5;
        // float is 7 digits precision and of 32 (4 bytes)
        float myFloatVal = 3.1459F;
        // double is 16 digits precision and of 64 (8 bytes)
        double myDoubleVal = 2.71828D;
        double float2dub = (double) myFloatVal;
        System.out.println("int val " + myIntVal);
        System.out.println("float val " + myFloatVal);
        System.out.println("double val " + myDoubleVal);
        System.out.println("cast float 2 dub " + float2dub);

        // convert a give number of pounds to kilograms
        // 1 pound is equal to 0.45359237

        double pounds = 224D;
        double kilograms = 0.45359237D * pounds;
        System.out.println("224 Pounds is  " + kilograms);

    }
}
