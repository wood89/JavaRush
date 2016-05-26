package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> array = new ArrayList<>();

        array.add("January is 1 month");
        array.add("February is 2 month");
        array.add("March is 3 month");
        array.add("April is 4 month");
        array.add("May is 5 month");
        array.add("June is 6 month");
        array.add("July is 7 month");
        array.add("August is 8 month");
        array.add("September is 9 month");
        array.add("October is 10 month");
        array.add("November is 11 month");
        array.add("December is 12 month");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(String x : array){
        if(x.contains(name)) System.out.println(x);//напишите тут ваш код
        }
    }
}
