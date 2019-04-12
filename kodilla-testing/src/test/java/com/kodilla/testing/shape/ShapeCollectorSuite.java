
package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is begining of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
     public void testAddFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square testSquere = new Square(5);
        // When
        sc.addFigure(testSquere);
        // Then
        Assert.assertEquals(1, sc.getFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square testSquere = new Square(5);
        //When
        sc.addFigure(testSquere);
        sc.removeFigure(testSquere);
        //Then
        Assert.assertEquals(0, sc.getFigures().size());
    }

    @Test
    public void testGetFigure () {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square testSquere = new Square(5);
        //When
        sc.addFigure(testSquere);
        //Then
        Assert.assertEquals(testSquere, sc.getFigure(0));
    }
}

