package com.kodilla.good.patterns.food2door.logic;

public class OrderDto {

    private final String product;
    private final int quantity;

    public OrderDto(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
