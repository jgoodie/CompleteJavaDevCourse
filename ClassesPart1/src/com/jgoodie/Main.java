package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    Car myCar = new Car(); //new car object
        Car lindasCar = new Car(); //lindas car object
        Car neighborsCar = new Car();
        //myCar.model = "Civic"; //only if model is public in Car class
        myCar.setModel("Civic"); //more correct
        lindasCar.setModel("Pilot");
        neighborsCar.setModel("CRV");
        System.out.println("My car model is " + myCar.getModel());
        System.out.println("Linda's car model is " + lindasCar.getModel());
        System.out.println("Neighbor's car model is " + neighborsCar.getModel());
    }
}
