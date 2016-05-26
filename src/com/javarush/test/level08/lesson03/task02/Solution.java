package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> massiv = new HashMap<>();

        massiv.put("арбуз", "ягода");
        massiv.put("банан", "трава");
        massiv.put("вишня", "ягода");
        massiv.put("груша", "фрукт");
        massiv.put("дыня", "овощ");
        massiv.put("ежевика", "куст");
        massiv.put("жень-шень", "корень");
        massiv.put("земляника", "ягода");
        massiv.put("ирис", "цветок");
        massiv.put("картофель", "клубень");

        for(Map.Entry<String, String> pair : massiv.entrySet()){
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);//напишите тут ваш код
        }
    }
}
