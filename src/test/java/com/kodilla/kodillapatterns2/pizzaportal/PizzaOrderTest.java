package com.kodilla.kodillapatterns2.pizzaportal;

import com.kodilla.kodillapatterns2.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTest {
    @Test
    public void PizzaDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaDecorator();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void PizzaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaDecorator();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with cheese and sauce + extra cheese + meat + shrimps", description);

    }
}
