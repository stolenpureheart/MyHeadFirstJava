package org.test;

/**
 * Created by Маргарита on 24.03.2014.
 */
public class FirstApp {
    int x=0;
    byte b=8;
    short sh=10;
    long l=1000L;
    float f=56f;
    double d=0.5d;
    boolean bool=false;

    FirstApp(){

    }

    FirstApp(long lg){
        l=lg;
    }

    public void move(){
        System.out.println(x);
        x=2+2;
        System.out.println("x = " + x);
    }

    public long sum(){
        l+=500;
        return l;
    }
}
