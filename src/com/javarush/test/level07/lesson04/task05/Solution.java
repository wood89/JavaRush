package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> massiv1 = new ArrayList<>();
        ArrayList<Integer> massiv2 = new ArrayList<>();
        ArrayList<Integer> massiv3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        for(int i = 0; i < 20; i++){
            int number  = Integer.parseInt(reader.readLine());
            massiv1.add(number);
        }

        for(int i = 0; i < massiv1.size()/2; i++){
            massiv2.add(massiv1.get(i));
        }

        for(int i = massiv1.size()/2; i < massiv1.size(); i++){
            massiv3.add(massiv1.get(i));
        }

        for(int x: massiv3){
            System.out.println(x);
        }
    }
}
