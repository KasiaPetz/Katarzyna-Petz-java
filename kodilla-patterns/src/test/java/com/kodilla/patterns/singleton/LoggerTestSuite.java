package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logLogger() {
        Logger.getInstance().log("app");
    }
    @Test
    public void testGetLastLogg() {
        //Given
        //Then
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Logged: " + lastLog);

        //Then
        Assert.assertEquals("app", lastLog);
    }

}
