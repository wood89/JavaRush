package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> massiv = new ArrayList<>();

            String name1 = reader.readLine();
            int N = Integer.parseInt(name1);

            String name2 = reader.readLine();
            int M = Integer.parseInt(name2);

        for(int i = 0; i < N; i++){
            String name3 = reader.readLine();
            massiv.add(name3);
        }

        for(int i = 0; i < M; i++){
            massiv.add(massiv.get(0));
            massiv.remove(0);
        }

        for(String x: massiv)
        {
            System.out.println(x);
        }//напишите тут ваш код
    }
}
