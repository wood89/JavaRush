package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int massiv[] = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name);

        for(int i = 0; i < 3; i++){
            int number = Integer.parseInt(reader.readLine());
            massiv[i] = number;
        }

        System.out.println(name);
        System.out.println(massiv[0] + "." + massiv[1] + "." + massiv[2]);
        //напишите тут ваш код
    }
}
