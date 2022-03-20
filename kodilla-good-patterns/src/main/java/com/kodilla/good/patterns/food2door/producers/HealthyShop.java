package com.kodilla.good.patterns.food2door.producers;


import com.kodilla.good.patterns.food2door.logic.OrderDto;
import com.kodilla.good.patterns.food2door.logic.Producer;

public class HealthyShop implements Producer {

    public void process(OrderDto order) {
        System.out.println("Your order is accepted for implementation, may you be healthy - HealthyShop");
    }
}
