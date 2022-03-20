package com.kodilla.good.patterns.food2door.logic.informationservice;

import com.kodilla.good.patterns.food2door.logic.OrderDto;

public interface InformationService {

    void informSuccess();

    void showOrderDetails(OrderDto order);

    void informFail();
}
