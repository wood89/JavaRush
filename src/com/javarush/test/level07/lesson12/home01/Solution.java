package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> massiv1 = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            int number = Integer.parseInt(reader.readLine());
            massiv1.add(0, number);//напишите тут ваш код
        }

        for(int x: massiv1){
            System.out.println(x);
        }
    }
}
