package com.company;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    int x1 = 10;
        while (x1<=20){                     // пока x1<=20 выполнять выражение в фигурных скобках
            System.out.println(x1);
            x1 += 5;
        }

        int x2 = 3;
        do {                                // выполнять выражение в блоке do, пока x2<3, выполнится в любом случае 1 раз, т.к. блок do идет 1-ым
            System.out.println(x2);
            x2 +=1;
        }
        while (x2<10);

        int x3 = 5;
        for (int i = 0; i<10; i++){
            System.out.println(x3++);
        }

        String[] array = new String[10];
        for (int i=0; i<array.length; i++){
            array[i] = String.format("New String %s", i);
            System.out.println(array[i]);
        }

        for (String element : array){
            System.out.println(element);
            System.out.println(element.substring(8));
        }

        int[] mas1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] result = {};
        for (int x : mas1){
            if (x%2==0){

            }
        }
    }
}
