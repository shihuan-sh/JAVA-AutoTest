package com.course.testng;

import org.testng.annotations.Test;

import java.time.Duration;

public class TimeOutTest
{
    @Test(timeOut = 3000)//单位3毫秒
    public  void   testSuccess() throws InterruptedException
    {
        Thread.sleep(2000);

    }

    @Test(timeOut = 2000)//单位3毫秒
    public  void   testFailed() throws InterruptedException
    {
        Thread.sleep(4000);
    }
}

