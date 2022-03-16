package com.kodilla.good.patterns.challenges.orderservice.logic;

public interface OrdersRepository {

    void createOrder(User user, Product product);
}
