package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThinCrustDecorator extends AbstractPizzaOrderDecorator {

    protected ThinCrustDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().subtract(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " on thin crust";
    }
}
