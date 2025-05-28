//参数化第二种 provider传数据
package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class DataProviderTest
{
    @Test(dataProvider= "data")
    public  void   testDataProvider(String name, int age)
    {
        System.out.println("name = "+ name + " ; age = " + age);
    }
    //下面方法里的参数会传递给上面的，用上面的参数接住
    @DataProvider(name="data")
    public Object[] [] providerData()
    {
        Object[] [] O = new Object[][]
                {
                        {"zhangsan",10},
                        {"lisi",20}
                };
        return O;
    }



    //provider 支持根据方法进行参数传递
    @Test(dataProvider = "methodData")
    public void  test1(String name, int age)
    {
        System.out.println("test1方法 name="+name+" ; age="+age);
    }
    @Test(dataProvider = "methodData")
    public void  test2( String name, int age)
    {
        System.out.println("test2方法 name="+name+" ; age="+age);
    }
//根据参数方法名进行参数传递
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method  method)
    {
          Object[][]  result=null;
          if(method.getName().equals("test1"))
            {
                result = new Object[][]{
                {"zhangsan",20},{"lisi",30}};
            }
          else if(method.getName().equals("test2"))
          {
              result = new Object[][]{
                      {"wangwu",40},{"zhaoliu",50}};

          }
          return result;
    }
}
