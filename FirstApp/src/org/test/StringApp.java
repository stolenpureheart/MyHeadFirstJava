package org.test;

/**
 * Created by Маргарита on 06.04.2014.
 */
public class StringApp {
    String string1;
    String string2 = "test1";
    String string3 = new String("test2");

    public String returnString(){
        String newString = String.valueOf(string2.charAt(4));
        return newString;
    }

    public String charAtPosition(char newChar){
        return String.valueOf(newChar);
    }

    public static void main(String[] args){
        StringApp stringApp = new StringApp();
        System.out.println(stringApp.returnString());
        System.out.println(stringApp.charAtPosition('\uffff'));
        System.out.println(stringApp.stringTest1());
    }

    public int stringTest1(){
        String stringTest1 = string3.concat("qwert123");
        int result = string3.compareTo("test2");
        //boolean bool = stringTest1.contains("qw");
        string3.equals(string1);
        string3.endsWith("2");
        String stringTest2 = string3.substring(2);
        String stringTest3 = string3.substring(1,3);
        String string = string3.replace("test", "begin");
        String[] string1 = string.split("//");
        return result;
}
}
