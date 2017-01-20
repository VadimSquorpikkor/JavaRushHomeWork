package com.javarush.test.level04.lesson16.home03;

import java.io.*;
//import java.nio.Buffer;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int i;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            i = Integer.parseInt(reader.readLine());//напишите тут ваш код
            count += i;
        }while(i!=-1);

        System.out.println(count);
    }
}
