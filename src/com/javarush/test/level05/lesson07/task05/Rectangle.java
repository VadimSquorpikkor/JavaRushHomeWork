package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int width, int height)
    {
        this.height = height;
        this.width = width;
    }

    public void initialize(int width)
    {
        this.height = width;
        this.width = width;
    }

    public void initialize(int width, int height, int top, int left)
    {
        this.height = height;
        this.width = width;
        this.top = top;
        this.left = left;
    }

    public void initialize(Rectangle rectangle)
    {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.top = rectangle.top;
        this.left = rectangle.left;
    }

    public void initialize()
    {
        this.height = 1;
        this.width = 1;
    }



}
