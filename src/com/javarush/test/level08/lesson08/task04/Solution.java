package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        map.put("Khomov", new Date("JULY 6 1989"));
        map.put("Khomova", new Date("DECEMBER 24 1991"));
        map.put("Moiseeva", new Date("NOVEMBER 27 1986"));
        map.put("Moiseev", new Date("JUNE 24 1988"));
        map.put("Del Piero", new Date("JULY 25 1989"));
        map.put("Smirnov", new Date("AUGUST 1 1992"));
        map.put("Smirnova", new Date("OCTOBER 14 1995"));
        map.put("Iguain", new Date("MAY 1 1989"));
        map.put("Zidan", new Date("MAY 9 1989"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (HashMap.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();
            if(value.equals("JUNE")) map.remove(key);
            System.out.println(map);
        }
        }

    public static void main(String[] args)
    {
        removeAllSummerPeople(createMap());
    }
    }
