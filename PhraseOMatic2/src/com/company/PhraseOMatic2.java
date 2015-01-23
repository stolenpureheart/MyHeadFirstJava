package com.company;

public class PhraseOMatic2 {

    public static void main(String[] args) {
        //Создайте два набора слов для выбора. Добавляйте собственные слова!
        String[] wordListOne = {"красивый", "умный", "добрый", "отзывчивый", "веселый", "ласковый"};

        String[] wordListTwo = {"котенок", "друг", "мужчина", "щенок"};

        //Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;

        //Генерируем два случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);

        //Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2];

        //Выводим фразу на экран
        System.out.println("Тебе нужен, - " + phrase);
    }
}
