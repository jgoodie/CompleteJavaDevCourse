package com.jgoodie;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        //dog.eat(); // eat and move were defined in Animal.java not Dog.java! Inheritance!!
        //dog.walk(); // super.move
        dog.run(); //used overridden move
        System.out.println(dog.getName());
    }
}
