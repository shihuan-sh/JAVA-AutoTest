package com.course.testng.suite;

import org.testng.annotations.Test;
//测试主要test标签中的方法
public class PayTest {
    @Test
  public  void   paySuccess()
  {
      System.out.println("支付宝支付成功");
  }
}
