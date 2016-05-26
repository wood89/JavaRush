package com.javarush.test.level08.lesson08.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();

        for(int x = 0; x < 20; x++){
        set.add(x);}
        //напишите тут ваш код

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer number = iterator.next();
           // if(number < 10) set.remove();
        }
        return set;
    }

    public static void main(String[] args)
    {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
