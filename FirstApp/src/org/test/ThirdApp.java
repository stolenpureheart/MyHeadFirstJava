package org.test;

/**
 * Created by Маргарита on 30.03.2014.
 */
public class ThirdApp {
    long lm;
    static int x;
    FirstApp app = new FirstApp(1000);
    public void initLongValue(){
        lm=app.sum();
        ThirdApp thirdApp = new ThirdApp();
        long value = thirdApp.lm;
        int y = ThirdApp.x;
        long local = app.l;
    }
}
