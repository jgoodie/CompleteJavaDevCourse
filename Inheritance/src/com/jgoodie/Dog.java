package com.jgoodie;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // call or initialize the Animal class
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog is chewing!");
    }

    @Override // we are overriding a method from the Animal.java class
    public void eat() {
        System.out.println("Dog is eating");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking");
        super.move(5);
    }
    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Move overridden");
        moveLegs(speed);
        super.move(speed);
    }
}
