package com.kodilla.good.patterns.food2door.producers;

import com.kodilla.good.patterns.food2door.logic.OrderDto;
import com.kodilla.good.patterns.food2door.logic.Producer;

public class ExtraFoodShop implements Producer {

    public void process(OrderDto order) {
        System.out.println("Your extra food started its journey to you - ExtraFoodShop");
    }
}
