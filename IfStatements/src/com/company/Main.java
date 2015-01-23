package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1 = "test1";
        if(s1.equals("test")){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }

        int i = 50;
        if(i==50){
            System.out.println(i);
        }
        else{
            System.out.printf("The number is not %d", i);
        }

        boolean isVisible = false;

        if(s1.equals("test")){
            isVisible = true;
        }
        else if(s1.equals("test1")){

        }
        else if(s1.equals("test2")){

        }
        else{
            isVisible = false;
        }

        if(isVisible){
            System.out.println(5*6);
        }
        else{
            System.out.println(9*12);
        }

        System.out.println(isVisible);
    }
}
