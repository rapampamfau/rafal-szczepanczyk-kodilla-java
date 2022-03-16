package com.kodilla.good.patterns.challenges.orderservice.logic;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrdersRepository ordersRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrdersRepository ordersRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.ordersRepository = ordersRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            ordersRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
