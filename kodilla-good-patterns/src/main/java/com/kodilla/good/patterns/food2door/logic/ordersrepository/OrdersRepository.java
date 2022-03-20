package com.kodilla.good.patterns.food2door.logic.ordersrepository;

import com.kodilla.good.patterns.food2door.logic.OrderDto;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository implements RepositoryService {

    private List<OrderDto> ordersToRealization = new ArrayList<>();

    public void addOrder(OrderDto order) {
        ordersToRealization.add(order);
    }
}
