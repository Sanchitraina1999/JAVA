package com.company;

public class Dog extends Animal{
    private int eyes;

    public Dog(String name, int eyes) {
        super(name);
        this.eyes = eyes;
    }

    @Override
    public String eat() {
        System.out.println("Dog.eat() called");
        chew();
        return super.eat();
    }

    private void chew(){
        System.out.println("Dog chews");
    }
}
