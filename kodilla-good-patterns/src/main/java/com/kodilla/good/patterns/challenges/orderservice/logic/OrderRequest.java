package com.kodilla.good.patterns.challenges.orderservice.logic;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime date;

    public OrderRequest(User user, Product product, LocalDateTime date) {
        this.user = user;
        this.product = product;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
