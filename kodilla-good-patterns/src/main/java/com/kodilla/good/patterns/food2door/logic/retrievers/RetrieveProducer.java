package com.kodilla.good.patterns.food2door.logic.retrievers;

import com.kodilla.good.patterns.food2door.logic.Producer;
import com.kodilla.good.patterns.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producers.HealthyShop;

public class RetrieveProducer {

    public Producer retrieve() {

        Producer producer1 = new GlutenFreeShop();
        Producer producer2 = new HealthyShop();
        Producer producer3 = new ExtraFoodShop();

        return producer1;
    }
}
