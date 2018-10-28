package com.kodilla.testing.collection;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case : begin");
    }
    @After
    public void after() {
        System.out.println("Test Case : end");
    }
    @Test
        public void testOddNumbersExterminatorEmptyList() {         // sprawdza na pustej lisce
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(list);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
        public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbersList);
        //Then
        Assert.assertEquals(3, result.size());
    }
}
