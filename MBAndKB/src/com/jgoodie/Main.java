package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2049);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes <0){
            System.out.println("Invalid Value");
        }
        else {
            int mb = kiloBytes/1024;
            int modulo = kiloBytes%1024;
            System.out.println(kiloBytes + " KB " +
                    "= " + mb + " MB " + "and " + modulo + " KB" );
        }
    }
}
