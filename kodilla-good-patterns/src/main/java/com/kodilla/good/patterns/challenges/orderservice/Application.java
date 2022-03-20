package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.orderservice.logic.MailService;
import com.kodilla.good.patterns.challenges.orderservice.logic.OrderProcessor;
import com.kodilla.good.patterns.challenges.orderservice.logic.OrderRequest;
import com.kodilla.good.patterns.challenges.orderservice.logic.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.orderservice.slippers.SlippersOrderService;
import com.kodilla.good.patterns.challenges.orderservice.slippers.SlippersRepository;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new SlippersOrderService(), new SlippersRepository());
        orderProcessor.process(orderRequest);
    }
}
