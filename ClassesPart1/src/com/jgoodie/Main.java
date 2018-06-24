package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    Car myCar = new Car(); //new car object
        Car lindasCar = new Car(); //lindas car object
        //myCar.model = "Civic"; //only if model is public in Car class
        myCar.setModel("Civic"); //more correct
        System.out.println("Model is " + myCar.getModel());
    }
}
