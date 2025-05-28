        //测试方法：就像是一个“小任务”，用来验证一个具体的功能。
        //测试类：就像是一个“任务集合”，包含多个小任务（测试方法）。
        //测试套件：就像是一个“项目”，包含多个任务集合（测试类）。
        //测试套件配置：就像是“项目计划”，定义了如何运行这个项目（测试套件）
package com.course.testng.suite;

import org.testng.annotations.Test;

//测试主要test标签中的方法
public class LogicTest {
    @Test
    public  void loginTaoBao()
    {
        System.out.println("淘宝登录成功");
    }

}
