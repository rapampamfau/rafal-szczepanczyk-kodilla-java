package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country euCountry1 = new Country("Poland", 37952534);
        Country euCountry2 = new Country("Czechia", 10754623);
        Country euCountry3 = new Country("Germany", 83165434);
        Country euCountry4 = new Country("France", 68112456);
        Country euCountry5 = new Country("Spain", 37673237);
        Continent europe = new Continent();
        europe.addCountry(euCountry1);
        europe.addCountry(euCountry2);
        europe.addCountry(euCountry3);
        europe.addCountry(euCountry4);
        europe.addCountry(euCountry5);
        Country asiaCountry1 = new Country("Japan", 119289456);
        Country asiaCountry2 = new Country("China", 1412639453);
        Country asiaCountry3 = new Country("India", 1397423064);
        Country asiaCountry4 = new Country("Qatar",  2840690);
        Country asiaCountry5 = new Country("Bangladesh", 164793401);
        Continent asia = new Continent();
        asia.addCountry(asiaCountry1);
        asia.addCountry(asiaCountry2);
        asia.addCountry(asiaCountry3);
        asia.addCountry(asiaCountry4);
        asia.addCountry(asiaCountry5);
        Country africaCountry1 = new Country("Nigeria", 206139589);
        Country africaCountry2 = new Country("Ethiopia", 114963588);
        Country africaCountry3 = new Country("Egypt", 102334404);
        Country africaCountry4 = new Country("Angola", 32866272);
        Country africaCountry5 = new Country("Madagascar", 27691018);
        Continent africa = new Continent();
        africa.addCountry(africaCountry1);
        africa.addCountry(africaCountry2);
        africa.addCountry(africaCountry3);
        africa.addCountry(africaCountry4);
        africa.addCountry(africaCountry5);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        // When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("3818639219");

        // Then
        assertEquals(expectedResult, result);
    }
}
