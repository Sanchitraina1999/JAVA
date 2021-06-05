package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal ob = new Animal("Animal");
        Dog dog = new Dog("Yorkie",2);
        System.out.println(dog.getName() + " "+ dog.eat());
    }
}
