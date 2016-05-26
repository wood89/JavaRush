package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int res = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 4; i++){
            String name = reader.readLine();
            int number = Integer.parseInt(name);
            if(number > res) res = number;
        }
        System.out.println(res);
        //напишите тут ваш код
    }
}
