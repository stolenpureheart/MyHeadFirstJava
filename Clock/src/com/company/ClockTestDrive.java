package com.company;

/**
 * Created by Маргарита on 12.10.2014.
 */
public class ClockTestDrive {

    public static void main(String [] args){

        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("время: " + tod);
    }
}
