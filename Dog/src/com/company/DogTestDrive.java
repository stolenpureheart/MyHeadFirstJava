package com.company;

/**
 * Created by Маргарита on 11.10.2014.
 */
public class DogTestDrive {
    public static void main (String [] args){
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        Dog d = new Dog();

        one.bark();
        two.bark();
        three.bark();
        d.bark2(3);
    }
}
