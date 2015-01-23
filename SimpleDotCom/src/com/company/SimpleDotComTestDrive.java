package com.company;

/**
 * Created by Маргарита on 04.11.2014.
 */
public class SimpleDotComTestDrive {

    public static void main (String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
}
        }
