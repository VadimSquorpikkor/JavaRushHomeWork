package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Говнокод. Потом подумаю, как лучше
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";
        System.out.println(a + b + c);//напишите тут ваш код
        System.out.println(a + c + b);//напишите тут ваш код
        System.out.println(b + a + c);//напишите тут ваш код
        System.out.println(b + c + a);//напишите тут ваш код
        System.out.println(c + a + b);//напишите тут ваш код
        System.out.println(c + b + a);//напишите тут ваш код

    }
}