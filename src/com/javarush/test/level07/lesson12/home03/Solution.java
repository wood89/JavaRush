package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> massiv = new ArrayList<>();

        int maximum = maxim(massiv);
        int minimum = minim(massiv);


        for (int i = 0; i < 3; i++)
        {
            String name = reader.readLine();
            int number = Integer.parseInt(name);
            massiv.add(number);//напишите тут ваш код
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);}

    public static int maxim(ArrayList<Integer> massiv){
        int maximum = massiv.get(0);
        for(int i = 0; i < massiv.size(); i++){
            if(maximum < massiv.get(i)){
                maximum = massiv.get(i);
            }
        }
        return maximum;
    }

    public static int minim(ArrayList<Integer> massiv){
        int minimum = massiv.get(0);
        for(int i = 0; i < massiv.size(); i++){
            if(minimum > massiv.get(i)){
                minimum = massiv.get(i);
            }
        }
        return minimum;
    }
}