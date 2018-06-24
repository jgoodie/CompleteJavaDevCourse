package com.jgoodie;

public class Car {
    // define the fields
    private int doors;
    private int wheels;
    private String model; // public makes it accessible from the outside
    private String color;
    private int cylinders;
    private double engineCapacity;
    private String engineType; //gas, hybrid, electric, fuel cell

    // need to create some kind of accessor method to update the fields/variables
    public void setModel(String model){
        //use this to specify the field to update; it's like self in python
        String validModel = model.toLowerCase();
        if(validModel.equals("civic") || validModel.equals("pilot")){
            this.model = model; // this is pretty pointless but you get the idea
        }
        else {
            this.model = "something else";
        }
    }
    public String getModel(){
        return this.model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getWheels() {
        return this.wheels;
    }
    public void setEngineType(String engineType, int cylinders, double engineCapacity) {
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.engineCapacity = engineCapacity;
    }

    public String getEngineType() {
        return this.engineType;
    }
    public int getCylinders(){
        return this.cylinders;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }
}


