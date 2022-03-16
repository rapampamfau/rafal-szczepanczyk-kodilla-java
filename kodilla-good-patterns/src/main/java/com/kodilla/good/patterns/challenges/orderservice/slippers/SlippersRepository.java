package com.kodilla.good.patterns.challenges.orderservice.slippers;

import com.kodilla.good.patterns.challenges.orderservice.logic.OrdersRepository;
import com.kodilla.good.patterns.challenges.orderservice.logic.Product;
import com.kodilla.good.patterns.challenges.orderservice.logic.User;

public class SlippersRepository implements OrdersRepository {

    public void createOrder(User user, Product product) {
        System.out.println("Created order for " + user.getName() + " " + user.getSurname() +
                " that contains " + product.getProductName());
    }
}
