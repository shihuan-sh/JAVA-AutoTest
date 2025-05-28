package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1()
    {
        System.out.println("test1");
        //throw new RuntimeException();
    }
//添加依赖关系   test2执行以来test1.如果依赖项失败，则一个执行，一个忽略
    @Test(dependsOnMethods = {"test1"})
    public void test2()
    {
        System.out.println("test2");
    }
}
