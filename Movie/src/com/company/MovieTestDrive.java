package com.company;

public class MovieTestDrive {

    public static void main(String[] args) {
       Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, нов целом веслая";
        three.rating = 127;
    }
}
