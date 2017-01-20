package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;


/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Универсальный алгоритм для любого кол-ва чисел
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;// По-правильному значение n должно задаваться через BufferedReader, но так прога не пройдет тест на javaRush

        for (int i = 0; i < 3; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);

        System.out.println(list.get(n/2));
    }
}
