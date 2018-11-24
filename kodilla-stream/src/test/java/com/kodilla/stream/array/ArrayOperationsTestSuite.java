package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbersTest = new int[20];

        //When
        for (int i = 0; i<20; i++) {
            numbersTest[i] = i + 1;
        }
        //Then
        Assert.assertEquals(10.5, ArrayOperations.getAverrage(numbersTest), 0.001);
    }

}
