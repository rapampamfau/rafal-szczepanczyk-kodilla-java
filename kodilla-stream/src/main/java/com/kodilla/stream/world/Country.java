package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String country;
    private final long people;

    public Country(final String country, final long people) {
        this.country = country;
        this.people = people;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal(people);
        return peopleQuantity;
    }

    public String getCountryName() {
        return country;
    }

    public long getPeople() {
        return people;
    }
}
