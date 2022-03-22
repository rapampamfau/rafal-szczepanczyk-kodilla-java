package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Flight {

    private final String departurePlace;
    private final List<String> indirectCities;

    public Flight(String departurePlace, List<String> indirectCities) {
        this.departurePlace = departurePlace;
        this.indirectCities = indirectCities;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public List<String> getIndirectCities() {
        return indirectCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departurePlace, flight.departurePlace) && Objects.equals(indirectCities, flight.indirectCities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departurePlace, indirectCities);
    }

    public static List<String> getCityKey(String city) {
        List<String> resultList = new ArrayList<>();
        FlightsDatabase database = new FlightsDatabase();
        for (Map.Entry<Flight, List<String>> y : database.getFlights().entrySet()) {
            String departureCity = y.getKey().getDeparturePlace();
            if (departureCity.equals(city)) {
                resultList = y.getValue();
            }
        }
        return resultList;
    }
}
