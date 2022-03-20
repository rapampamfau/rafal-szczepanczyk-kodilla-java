package com.kodilla.good.patterns.food2door.logic.retrievers;

import com.kodilla.good.patterns.food2door.logic.OrderDto;

public class RetrieveOrderInfo {

    public OrderDto retrieve() {

        OrderDto order1 = new OrderDto("Eggs", 10);
        OrderDto order2 = new OrderDto("Milk", 40);
        OrderDto order3 = new OrderDto("Apple", 25);
        OrderDto order4 = new OrderDto("Banana", 70);
        OrderDto order5 = new OrderDto("Watermelon", 10);

        return new OrderDto(order1.getProduct(), order1.getQuantity());
    }
}
