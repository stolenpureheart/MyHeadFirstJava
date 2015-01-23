package org.test;

/**
 * Created by Маргарита on 06.04.2014.
 */
public class StringArray {
    String[] stringArray = new String[5];
    String[][] stringArray2 = new String[2][5];

    public void stringArrayInit(){
        stringArray[0] = "test";
        stringArray2[1][2] = "test3";
        int i = stringArray.length;
        stringArray.toString();
    }
}
