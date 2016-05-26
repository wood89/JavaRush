package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> massiv1 = new ArrayList<>();
        ArrayList<Integer> massiv2 = new ArrayList<>();
        ArrayList<Integer> massiv3 = new ArrayList<>();
        ArrayList<Integer> massiv4 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        for (int i = 0; i < 20; i++)
        {
            int number = Integer.parseInt(reader.readLine());
            massiv1.add(number);
        }

        for (int i = 0; i < massiv1.size(); i++)
        {

            if (massiv1.get(i) % 3 == 0 & massiv1.get(i) != 0) massiv2.add(massiv1.get(i));
        }

        for (int i = 0; i < massiv1.size(); i++)
        {
            if (massiv1.get(i) % 2 == 0 & massiv1.get(i) != 0) massiv3.add(massiv1.get(i));
        }

        for (int i = 0; i < massiv1.size(); i++)
        {
            if (massiv1.get(i) % 2 == 0 & massiv1.get(i) % 3 == 0) massiv4.add(massiv1.get(i));
            if(massiv1.get(i) % 2 != 0 & massiv1.get(i) % 3 != 0) massiv4.add(massiv1.get(i));
        }

        Solution.printList(massiv2);
        Solution.printList(massiv3);
        Solution.printList(massiv4);
    }

    public static void printList(List<Integer> list)
    {
        for(int x: list){
            System.out.println(x);//напишите тут ваш код
        }
    }
}