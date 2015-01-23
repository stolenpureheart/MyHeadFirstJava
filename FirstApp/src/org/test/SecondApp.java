package org.test;

/**
 * Created by Маргарита on 24.03.2014.
 */
public class SecondApp {

    public static void main(String[] arg){
        FirstApp app=new FirstApp(100);
        app.move();
        System.out.println(app.sum());
    }
}
