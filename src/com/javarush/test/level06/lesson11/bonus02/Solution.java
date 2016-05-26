package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name_grandfather = reader.readLine();
        Cat grandfather = new Cat(name_grandfather);

        String name_grandmother = reader.readLine();
        Cat grandmother = new Cat(name_grandmother);

        String name_father = reader.readLine();
        Cat father = new Cat(name_father, "null", grandfather);

        String name_mother = reader.readLine();
        Cat mother = new Cat(name_mother, grandmother, "null");

        String name_son = reader.readLine();
        Cat son = new Cat(name_son, mother, father);

        String name_daughter = reader.readLine();
        Cat daughter = new Cat(name_daughter, mother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat
    {
        private String name;
        private Cat fat;
        private Cat mot;
        private String not;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat mot1, String no)
        {
            this.name = name;
            this.mot = mot1;
            not = no;
        }

        Cat(String name, String no, Cat fat1)
        {
            this.name = name;
            this.mot = fat1;
            not = no;
        }


        Cat(String name, Cat mot1, Cat fat1)
        {
            this.name = name;
            this.mot = mot1;
            this.fat = fat1;
        }

        @Override
        public String toString()
        {
            if (mot == null & fat == null)
                return "Cat name is " + name + ", no mother " + ", no father ";
            if (mot == null & not.equals("null"))
                return "Cat name is " + name + ", no mother " + ", father is " + fat.name;
            if (fat == null & not.equals("null"))
                return "Cat name is " + name + ", mother is " + mot.name + ", no father ";
            else
                return "Cat name is " + name + ", mother is " + mot.name + ", father is " + fat.name;
        }
    }
}
