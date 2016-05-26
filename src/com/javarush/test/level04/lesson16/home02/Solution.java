package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.ArrayList;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int massiv1[] = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
            int number = Integer.parseInt(reader.readLine());
            massiv1[i] = number;
        }

        int first_element = massiv1[0];
        int max = 0;
        int min = 0;
        int mid = 0;
        for (int i = 0; i < 3; i++)
        {
            if(first_element <= massiv1[i]) max = massiv1[i];
        }

        for (int i = 0; i < 3; i++)
        {
            if(first_element >= massiv1[i]) min =  massiv1[i];
        }

        for (int i = 0; i < 3; i++)
        {
            if(massiv1[i] != max & massiv1[i] != min) mid = massiv1[i];
        }

        System.out.println(mid);
        //напишите тут ваш код
    }
}
