package com.javarush.test.level00.lesson03.task02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* На дворе 31 век
Написать программу, выводящую на экран нынешний год. На дворе 31 век, если что.

Подсказка:
Возьмите текущий год и измените век на 31.
Вывести нужно число, состоящее из четырех цифр.
*/
public class Solution
{
    public static void main(String[] args)
    {
        GregorianCalendar g = new GregorianCalendar();//напишите тут ваш код
        int a = g.get(Calendar.YEAR);
        System.out.println(a + 1000);
    }
}
