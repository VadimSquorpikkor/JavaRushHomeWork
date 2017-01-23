package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        GregorianCalendar gc = new GregorianCalendar();
        System.out.print(gc.get(Calendar.DAY_OF_MONTH) + " ");
        if(gc.get(Calendar.MONTH)<9)System.out.print("0" + (gc.get(Calendar.MONTH) + 1) + " ");
        else System.out.print(gc.get(Calendar.MONTH) + 1 + " ");
        System.out.print(gc.get(Calendar.YEAR));
    }
}
