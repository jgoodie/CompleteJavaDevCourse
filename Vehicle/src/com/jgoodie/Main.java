package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    //Car myCar = new Car("sedan", "Honda", "Civic", 2018, 4,4, 1250);
        HondaCar myHonda = new HondaCar("sedan", "civic", 2018, 4, 1250, false, false,false, false);
        System.out.println(myHonda.getMake());
        System.out.println(myHonda.getModel());
    }
}
