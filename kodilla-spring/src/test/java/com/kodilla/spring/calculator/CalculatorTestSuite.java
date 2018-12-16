package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(6.0, 4.0);
        double subResult = calculator.sub(6.0, 4.0);
        double mulResult = calculator.mul(6.0, 4.0);
        double divResult = calculator.div(6.0, 4.0);

        //Then
        Assert.assertEquals(10.0, addResult,0.001);
        Assert.assertEquals(2.0, subResult, 0.001);
        Assert.assertEquals(24.0, mulResult, 0.001);
        Assert.assertEquals(1.5, divResult, 0.001);
    }
}
