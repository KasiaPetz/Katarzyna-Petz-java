package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logLogger() {
        Logger.getInstance().log("Log 1");
    }
    @Test
    public void testGetLastLogg() {
        //Given
        //Then
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Logged: " + lastLog);

        //Then
        Assert.assertEquals("Log 1", lastLog);
    }

}
