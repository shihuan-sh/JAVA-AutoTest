package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本注解，标记测试一部分
    @Test//Junit测试框架的核心部分。单元测试框架的核心，用于标识测试方法
    public void testCase1()
    {
        System.out.println("testCase1");
    }
    @Test
    public void  testCase2()
    {
        System.out.println("testCase2");
    }
    @BeforeMethod
    public void  beforeMethod()
    {
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public  void afterMethod()
    {
        System.out.println("afterMethod");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass类运行之前");
    }
    @AfterClass
    public  void afterClass()
    {
        System.out.println("afterClass类运行之后");
    }
    @BeforeSuite//测试套件
    public void beforeSuite()
    {
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public  void afterSuite()
    {
        System.out.println("afterSuite测试套件");
    }
}
