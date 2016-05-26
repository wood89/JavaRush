package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Khomov3", "1");
        map.put("Khomov1", "2");
        map.put("Khomova1", "3");
        map.put("Khomov2", "4");
        map.put("Khomova2", "5");
        map.put("Khomova3", "6");
        map.put("Moiseeva1", "7");
        map.put("Moiseev1", "8");
        map.put("Moiseev2", "9");
        map.put("Moiseeva2", "1");
        return map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int y = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            if(key.equals(name)) y++;
        }//напишите тут ваш код
        return y;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int y = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();                  //значение
            if(value.equals(lastName)) y++;
        }//напишите тут ваш код
        return y;//напишите тут ваш код

    }

    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(), "Khomov1"));
        System.out.println(getCountTheSameLastName(createMap(), "1"));
    }
}
