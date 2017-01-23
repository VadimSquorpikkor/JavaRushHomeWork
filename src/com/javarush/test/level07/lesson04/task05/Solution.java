package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int n = 10;
        int[] bigList = new int[2*n];
        int[] smlList1 = new int[n];
        int[] smlList2 = new int[n];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigList.length; i++)
        {
            bigList[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < n; i++)
        {
            smlList1[i] = bigList[i];
            smlList2[i] = bigList[i + 10];
        }
        for (int i:smlList2)
        {
            System.out.println(i);
        }


    }
}
