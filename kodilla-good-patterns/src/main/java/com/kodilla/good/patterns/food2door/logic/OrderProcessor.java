package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.logic.informationservice.InformationService;
import com.kodilla.good.patterns.food2door.logic.ordersrepository.RepositoryService;

public class OrderProcessor {

    private final InformationService informationService;
    private final RepositoryService repositoryService;

    public OrderProcessor(InformationService informationService, RepositoryService repositoryService) {
        this.informationService = informationService;
        this.repositoryService = repositoryService;
    }

    public void orderProcess(Producer producer, OrderDto order) {
        if (order.getQuantity() > 0 && order.getProduct() != null && producer != null) {
            producer.process(order);
            informationService.showOrderDetails(order);
            repositoryService.addOrder(order);
            informationService.informSuccess();
        } else {
            informationService.informFail();
        }
    }
}
