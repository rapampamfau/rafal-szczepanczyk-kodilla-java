package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(true)
                .burgers(2)
                .sauce("Mild")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}
