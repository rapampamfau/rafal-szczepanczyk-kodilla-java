package com.kodilla.good.patterns.challenges.orderservice.logic;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, Product product, LocalDateTime date);
}
