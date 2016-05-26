package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> massiv = new HashSet<>();

        massiv.add("арбуз");
        massiv.add("банан");
        massiv.add("вишня");
        massiv.add("груша");
        massiv.add("дыня");
        massiv.add("ежевика");
        massiv.add("жень-шень");
        massiv.add("земляника");
        massiv.add("ирис");
        massiv.add("картофель");

        for(String x : massiv){
        System.out.println(x);}//напишите тут ваш код
    }
}
