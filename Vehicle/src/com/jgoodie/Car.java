package com.jgoodie;

public class Car extends Vehicle {
    private boolean steering;
    private double direction; // NSWE in deg
    private double speed;
    private int gearState;
    private boolean breaking;

    public Car(String vehicleType, String make, String model, int year, int wheels, int doors, int weight) {
        super(vehicleType, make, model, year, wheels, doors, weight);
        this.steering = false;
        this.direction = 0.0;
        this.speed = 0.0;
        this.gearState = 0;
        this.breaking = true;
        System.out.println("Car constructor 1");
    }

    public Car(String vehicleType, String make, String model, int year, int wheels, int doors, int weight, boolean steering, double direction, double speed, int gearState, boolean breaking) {
        super(vehicleType, make, model, year, wheels, doors, weight);
        this.steering = steering;
        this.direction = direction;
        this.speed = speed;
        this.gearState = gearState;
        this.breaking = breaking;
        System.out.println("Car constructor 2");
    }

    public void accelerate(int speed){
        if(speed <0){
            System.out.println("Invalid Speed");
        }
        else {
            this.speed += speed;
        }
    }

    public void decelerate(int speed){
        if (speed <0){
            System.out.println("Invalid Speed");
        }
        else{
            this.speed -= speed;
        }
    }

    public boolean isSteering() {
        return steering;
    }

    public void setSteering(boolean steering) {
        this.steering = steering;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGearState() {
        return gearState;
    }

    public void setGearState(int gearState) {
        this.gearState = gearState;
    }

    public boolean isBreaking() {
        return breaking;
    }

    public void setBreaking(boolean breaking) {
        this.breaking = breaking;
    }
}
