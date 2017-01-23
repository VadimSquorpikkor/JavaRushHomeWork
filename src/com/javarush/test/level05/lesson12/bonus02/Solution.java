package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);*/
////////////////////////////////////////////////////////////////////////////////////
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        System.out.println("Minimum = " + list.get(0));
    }
////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("Minimum = " + minimum);
    /*public static int min(int a, int b)
    {
        return a < b ? a : b;
    }*/

}
