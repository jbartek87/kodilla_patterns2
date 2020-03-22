package com.kodilla.kodillapatterns2.pizza;

import java.math.BigDecimal;

public class MeatDecorator extends AbstractPizzaOrderDecorator {
    public MeatDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + meat";
    }

}
