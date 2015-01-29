package com.company;

/**
 * Created by Маргарита on 29.01.2015.
 */
public class DVDPlayerTestDrive2 {
    public static void main (String [] args){
        DVDPlayer2 d = new DVDPlayer2();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}
