package com.javarush.test.level04.lesson02.task02;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

public class Cat {////////////////Тупая задача
   private static int catsCount = 0;

    public static void addNewCat() {
        Cat cat = new Cat();//напишите тут ваш код
        catsCount++;
    }
}

/*class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.addNewCat();
        cat.addNewCat();
        cat.addNewCat();
        System.out.println(Cat.catsCount);
    }

}*/
