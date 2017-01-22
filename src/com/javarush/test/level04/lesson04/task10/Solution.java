package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара
равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(a == b && a==c) System.out.println(a+" "+b+" "+c);
        else
        {
            if (a == b) System.out.println(a + " " + b);
            if (a == c) System.out.println(a + " " + c);
            if (b == c) System.out.println(b + " " + c);
        }
        /*int count = 0;
        int n = 3;
        int num = 0;
        for (int i = 0; i < n; i++)
        {
            int[] list = new int[n];
            list[i] = Integer.parseInt(reader.readLine());
            for (int j = i; j > 0; j--)
            {
                if(list[i] == list[j])
                {
                    count++;
                    num = list[i];
                }
            }
        }
        for (int i = 0; i < count; i++)
        {
            System.out.println(num + " ");
        }*/

    }
}