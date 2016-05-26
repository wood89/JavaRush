package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int massiv[] = new int [5];

        for(int i = 0; i < 5; i++){
        String name = reader.readLine();
        int number = Integer.parseInt(name);
       massiv[i] = number;//напишите тут ваш код
        }

            for (int a = 1; a < massiv.length; a++)
                for (int b = massiv.length - 1; b >= a; b--)
                {
                    if (massiv [b - 1] > massiv [b]){
                    int t = massiv[b - 1];
                    massiv[b - 1] = massiv[b];
                    massiv[b] = t;
                }
                }

        for(int x: massiv){
            System.out.println(x);
  }
        }
        }
