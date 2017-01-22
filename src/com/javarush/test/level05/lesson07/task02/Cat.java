package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    int weight;//обязат. ср = 3
    int age;//обязат. ср = 2
    String colour;
    String address;

    public void initialize(String name)
    {
        this.name = name;
        this.weight = 3;
        this.age = 2;
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.weight = 3;
        this.age = age;
    }

    public void initialize(int weight, String colour)
    {
        this.colour = colour;
        this.weight = weight;
        this.age = 2;
    }

    public void initialize(int weight, String colour, String address)
    {
        this.colour = colour;
        this.weight = weight;
        this.age = 2;
        this.address = address;
    }

}
