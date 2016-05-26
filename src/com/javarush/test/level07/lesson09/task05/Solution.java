package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> massiv = new ArrayList<>();

        for(int i = 0; i < 2; i++)
        {
            String name = reader.readLine();
            massiv.add(name);
        }//Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(massiv);

        for(String x : result){
            System.out.println(x);//Вывести на экран result
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> massiv)
    {

        for(int i = 0; i < massiv.size(); i++){
            String s = massiv.get(i);
            massiv.add(i+1,s);
            i++;
        }
        return massiv;
    }
}
