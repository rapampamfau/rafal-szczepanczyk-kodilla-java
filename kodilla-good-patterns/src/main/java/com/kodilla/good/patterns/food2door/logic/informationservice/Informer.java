package com.kodilla.good.patterns.food2door.logic.informationservice;

import com.kodilla.good.patterns.food2door.logic.OrderDto;

public class Informer implements InformationService {

    public void showOrderDetails(OrderDto order) {
        System.out.println("Your order contains: " + order.getProduct() + " " + order.getQuantity() + "x");
    }

    public void informSuccess() {
        System.out.println("Order was properly created");
    }

    public void informFail() {
        System.out.println("Order wasn't created");
    }
}
