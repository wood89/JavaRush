package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {

        return method2();//напишите тут ваш код

    }

    public static StackTraceElement[] method2()
    {

        return method3();//напишите тут ваш код

    }

    public static StackTraceElement[] method3()
    {

        return method4();//напишите тут ваш код

    }

    public static StackTraceElement[] method4()
    {

        return method5();//напишите тут ваш код
    }

    public static StackTraceElement[] method5()
    {
        return Thread.currentThread().getStackTrace();//напишите тут ваш код
    }
}
