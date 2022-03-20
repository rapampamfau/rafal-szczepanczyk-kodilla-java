package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.logic.*;
import com.kodilla.good.patterns.food2door.logic.informationservice.Informer;
import com.kodilla.good.patterns.food2door.logic.ordersrepository.OrdersRepository;
import com.kodilla.good.patterns.food2door.logic.retrievers.RetrieveOrderInfo;
import com.kodilla.good.patterns.food2door.logic.retrievers.RetrieveProducer;

public class Application {

    public static void main(String[] args) {

        RetrieveOrderInfo retrieveOrderInfo = new RetrieveOrderInfo();
        RetrieveProducer retrieveProducer = new RetrieveProducer();

        OrderDto orderDto = retrieveOrderInfo.retrieve();
        Producer producer = retrieveProducer.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new Informer(), new OrdersRepository());
        orderProcessor.orderProcess(producer, orderDto);
    }
}
