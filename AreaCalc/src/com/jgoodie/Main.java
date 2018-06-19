package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius){
        // area of a circle pi*r^2
        if (radius < 0) {
            return -1.0;
        }
        else {
           return 3.14159*radius*radius;
        }
    }
    public static double area(double x, double y){
        // area of a circle pi*r^2
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        else {
            return x*y;
        }
    }
}
