package com.kodilla.good.patterns.challenges.orderservice.slippers;

import com.kodilla.good.patterns.challenges.orderservice.logic.OrderService;
import com.kodilla.good.patterns.challenges.orderservice.logic.Product;
import com.kodilla.good.patterns.challenges.orderservice.logic.User;

import java.time.LocalDateTime;

public class SlippersOrderService implements OrderService {

    public boolean order(User user, Product product, LocalDateTime date) {
        System.out.println("Order info:" +
                "\n User: " + user.getName() + " " + user.getSurname() +
                "\n Product: " + product.getProductName() +
                "\n Ordered in: " + date);
        return true;
    }
}
