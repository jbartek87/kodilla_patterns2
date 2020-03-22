package com.kodilla.kodillapatterns2.pizza;

import java.math.BigDecimal;

public class BasicPizzaDecorator implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with cheese and sauce";
    }
}
