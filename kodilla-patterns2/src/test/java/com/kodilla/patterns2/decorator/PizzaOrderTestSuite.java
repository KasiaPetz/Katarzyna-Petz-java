package com.kodilla.patterns2.decorator;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testRucolaWithProsciuttoGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RucolaPizzaOrderDecorator(theOrder);
        theOrder = new ProsciuttoPizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(25), theCost);

    }
    @Test
    public void testRucolaWithProsciuttoWithRicottaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RucolaPizzaOrderDecorator(theOrder);
        theOrder = new ProsciuttoPizzaOrderDecorator(theOrder);
        theOrder = new RicottaPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("PizzaOrder description:  + extra rucola + extra prosciutto + extra ricotta", description);
    }

    @Test
    public void testRucolaWithDoubleRicottaWithProsciuttoWithParmesanGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RucolaPizzaOrderDecorator(theOrder);
        theOrder = new RicottaPizzaOrderDecorator(theOrder);
        theOrder = new RicottaPizzaOrderDecorator(theOrder);
        theOrder = new ProsciuttoPizzaOrderDecorator(theOrder);
        theOrder = new ParmesanPizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(39), theCost);
    }
    @Test
    public void testRucolaWithDoubleRicottaWithProsciuttoWithParmesanGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RucolaPizzaOrderDecorator(theOrder);
        theOrder = new RicottaPizzaOrderDecorator(theOrder);
        theOrder = new RicottaPizzaOrderDecorator(theOrder);
        theOrder = new ProsciuttoPizzaOrderDecorator(theOrder);
        theOrder = new ParmesanPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("PizzaOrder description:  + extra rucola + extra ricotta + extra ricotta + extra prosciutto + extra parmesan",
                description);
    }
}
