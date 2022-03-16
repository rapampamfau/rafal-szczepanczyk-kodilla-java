package com.kodilla.good.patterns.challenges.orderservice.logic;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Frank", "Kimono", 1232);

        Product product = new Product("Kapcie");

        LocalDateTime date = LocalDateTime.of(2022, 2, 14, 18, 59);
        return new OrderRequest(user, product, date);
    }
}
