package com.company;

public class GoodDog {

    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size > 60){
            System.out.println("Гав Гав!");
        } else if(size > 14){
            System.out.println("Вуф Вуф!");
        } else{
            System.out.println("ТяФ Тяф!");
        }
    }
}
