package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest
{
    @Test
    public  void ignore1()
    {
        System.out.println("Ignore1 执行!");

    }

    @Test(enabled = false)//为false  表示不执行
    public void ignore2()
    {
        System.out.println("Ignore2 执行!");
    }

    @Test(enabled = true)
    public void ignore3()
    {
        System.out.println("Ignore3 执行!");
    }
}
