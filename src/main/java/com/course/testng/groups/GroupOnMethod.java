package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
//组测试
// 将方法级别分组，按 组执行
public class GroupOnMethod {
    @Test(groups = "server")
    public  void  test1(){
        System.out.println("这是服务端测试方法1");}
    @Test(groups = "server")
    public  void  test2()
    {
        System.out.println("这是服务端测试方法2");
    }

    @Test(groups = "client")
    public  void  test3()
    {
        System.out.println("这是客户端测试方法1");
    }

    @Test(groups = "client")
    public  void  test4()
    {
        System.out.println("这是客户端测试方法2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer()
    {
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer()
    {
        System.out.println("这是服务端组运行之后运行的方法");
    }
    
}
