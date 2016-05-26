package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());//напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());//напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> res = new HashSet<Object>();
        res.addAll(cats);
        res.addAll(dogs);//напишите тут ваш код
        return res;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Iterator <Object>  iterator1 = pets.iterator();
        Iterator <Cat>  iterator2 = cats.iterator();

        while (iterator1.hasNext()) {

            while (iterator2.hasNext()) {
                if (iterator1.equals(iterator2)) iterator1.remove();
            }
        }//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
        Iterator <Object> iterator = pets.iterator();

        while(iterator.hasNext()) {
            Object s = iterator.next();
            System.out.println(s);

        }
    }

    public static class Cat{

    }

    public static class Dog{

    }//напишите тут ваш код
}
