package com.javarush.test.level01.lesson04.task02;

import java.lang.String;

/* JavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
*/
public class Solution
{
    static String s = "JavaRush. Learn once - use anywhere";

    public static void main(String[] args)
    {
        print5Times(s);//напишите тут ваш код
        print5Times(s);//напишите тут ваш код
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
