package org.test;

/**
 * Created by Маргарита on 30.03.2014.
 */
public class FifthApp {
    public static void main(String[] args){
        ForthApp forthApp = new ForthApp();
        System.out.println(forthApp.getX());
        forthApp.setX(10);
        System.out.println(forthApp.getX());
    }
}
