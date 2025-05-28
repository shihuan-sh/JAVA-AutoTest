//异常测试
package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException
{
    /**
     * 不合法参数抛出异常，预期结果也是异常测试
     *
     */
    //这是一个个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)

    public  void  runTimeExceptionFailed()
    {
         System.out.println("这是一个失败的异常测试");
    }
//这是一个成功的异常测试

 @Test(expectedExceptions = RuntimeException.class)

    public  void  runTimeExceptionSuccess()
    {
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }

}
