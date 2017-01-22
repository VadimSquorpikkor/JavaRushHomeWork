package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    int weight;//обязат. ср = 3
    int age;//обязат. ср = 2
    String colour;
    String address;

    public Cat(String name)
    {
        this.name = name;
        this.weight = 3;
        this.age = 2;
    }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.weight = 3;
        this.age = age;
    }

    public Cat(int weight, String colour)
    {
        this.colour = colour;
        this.weight = weight;
        this.age = 2;
    }

    public Cat(int weight, String colour, String address)
    {
        this.colour = colour;
        this.weight = weight;
        this.age = 2;
        this.address = address;
    }


}
