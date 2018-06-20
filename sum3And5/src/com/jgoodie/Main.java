package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    int sum = 0;
	    int sumCount = 0;
        for (int i = 1; i <= 1000; i++){
            if((i%3 == 0) && (i%5 == 0)){
                sum += i;
                sumCount++;
                System.out.println(i);
            }
            if (sumCount == 5){
                System.out.println("break!");
                break;
            }
        }
        System.out.println(sum);

    }
}
