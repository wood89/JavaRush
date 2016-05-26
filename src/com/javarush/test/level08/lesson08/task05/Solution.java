package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomov", "Alexander");
        map.put("Khomova", "Rob");//напишите тут ваш код

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> chtoUdalit = new HashMap<String, String>(map);

        HashSet<String> newarr = new HashSet<String>();


        for(String f: chtoUdalit.values())
        {
            if (newarr.contains(f)) // Определяет, содержит ли строка последовательность символов в CharSequence
            {
                removeItemFromMapByValue(map, f);
            } else
                newarr.add(f);
        }
    }//напишите тут ваш код


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
