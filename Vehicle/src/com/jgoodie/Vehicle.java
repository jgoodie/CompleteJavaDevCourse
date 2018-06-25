package com.jgoodie;

public class Vehicle {
    private String vehicleType; // truck, car, motorcycle
    private String make;
    private String model;
    private int year;
    private int wheels;
    private int doors;
    private int weight;

    public Vehicle(String vehicleType, String make, String model, int year, int wheels, int doors, int weight) {
        this.vehicleType = vehicleType;
        this.make = make;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.doors = doors;
        this.weight = weight;
        System.out.println("Vehicle constructor");
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
