package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int i = array.get(0);// Найти минимум
        for(int x = 0; x < array.size(); x++){
            if(i > array.get(x)) i = array.get(x);
        }
        return i;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> array = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        int number1 = Integer.parseInt(name1);

        for(int i = 0 ; i < number1; i++){
            String name2 = reader.readLine();
            int number2 = Integer.parseInt(name2);
            array.add(number2);
        }//Тут создать и заполнить список
        return array;
    }
}
