package com.kodilla.good.patterns.food2door.producers;


import com.kodilla.good.patterns.food2door.logic.OrderDto;
import com.kodilla.good.patterns.food2door.logic.Producer;

public class GlutenFreeShop implements Producer {

    public void process(OrderDto order) {
        System.out.println("Thank you for ordering from our shop - GlutenFreeShop");
    }
}
