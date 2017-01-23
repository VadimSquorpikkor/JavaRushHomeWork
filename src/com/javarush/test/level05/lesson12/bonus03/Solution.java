package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        int N = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        int maximum = list.get(list.size() - 1);
        System.out.println(maximum);
    }
}
