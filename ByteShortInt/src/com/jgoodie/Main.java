package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // int has width of 32
        int myVal = 10000;
        int myMinVal = -2147483648; // smallest val for int
        // int myMinVal = -5147483649; // too big!!
        int myMaxVal = 2147483647; // largest val for int
        //int myMaxVal = 5147483649; // too big!
        // byte has width of 8
        byte myByteVal = 127; // -128 to 127
        // short has width of 16
        short myShortVal = -32768; // -32768 to 32767
        // long has a width of 64
        long myLongVal = 100L; // can store huge numbers

        //casting
        byte myCastedByte = (byte) (myByteVal/2);
        System.out.println("myCastedByte = " + myCastedByte);

        short myNewShort = (short) (myShortVal/2);
        System.out.println("myNewShort = " + myNewShort);

        byte byteVal = 32;
        short shortVal = 42;
        int intVal = 10;
        //long longVal = (long) (50000 + 10) * (byteVal + shortVal + intVal);
        long longVal = (50000L + 10L) * (byteVal + shortVal + intVal);
        System.out.println("crazy Long val = " + longVal);
        short shortF00 = (short) (1000+10 * (byteVal + shortVal + intVal));
        System.out.println("foobar ->" +shortF00);





    }
}
