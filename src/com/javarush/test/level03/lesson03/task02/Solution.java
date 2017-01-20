package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double usdSum1 = convertEurToUsd(100, 1.05);//напишите тут ваш код
        double usdSum2 = convertEurToUsd(50, 1.5);//напишите тут ваш код
        System.out.println(usdSum1);
        System.out.print(usdSum2);
    }

    public static double convertEurToUsd(int eur, double course){
        return ((double)eur)*course;//напишите тут ваш код
    }
}
