package com.course.testng.groups;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;

@Test(groups = "stu")
public class GroupsOnClass1
{
    public void  stu1()
    {
        System.out.println("GroupsOnClass1中的stu1运行");
    }
    public void  stu2()
    {
        System.out.println("GroupsOnClass1中的stu2运行");
    }

    @AfterGroups("stu")
    public void afterGroupsOnStu() {
        System.out.println("这是学生组测试之后运行的方法");
    }
}
