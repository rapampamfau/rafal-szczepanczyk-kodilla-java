package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Engine {

    public static void showFlightsFromEnteredCity(String city, Map<Flight, List<String>> flights) {
        
        List<String> resultList = Flight.getCityKey(city);
        if (resultList.size() != 0) {
            System.out.println(">>> From " + city + " we have flights to: ");
            resultList.stream()
                    .map(x -> city + "  ------>>>  " + x)
                    .forEach(System.out::println);
        } else {
            System.out.println("Sorry we don't have flight from this city");
        }
    }

    public static void showFlightsToEnteredCity(String city, Map<Flight, List<String>> flights) {
        List<String> citiesWhichYouCanFlightToEnteredCity = new ArrayList<>();
        for (Map.Entry<Flight, List<String>> e : flights.entrySet()) {
            List<String> valueList = e.getValue();
            if (valueList.contains(city)) {
                citiesWhichYouCanFlightToEnteredCity.add(e.getKey().getDeparturePlace());
            }
        }
        if (citiesWhichYouCanFlightToEnteredCity.size() != 0) {
            System.out.println(">>> List of flights to " + city + " :");
            citiesWhichYouCanFlightToEnteredCity.stream()
                    .map(e -> e + "   ----->>   " + city)
                    .forEach(System.out::println);
        } else {
            System.out.println("Sorry we don't have flight from this city");
        }
        citiesWhichYouCanFlightToEnteredCity.clear();
    }

    public static void showFlightsThroughEnteredCity(String city, Map<Flight, List<String>> flights) {
        for (Map.Entry<Flight, List<String>> e : flights.entrySet()) {
            List<String> indirectCities = e.getKey().getIndirectCities();
            if (indirectCities.contains(city)) {
                String departureCity = e.getKey().getDeparturePlace();
                int indirectCitiesListLength = e.getKey().getIndirectCities().size();
                System.out.println(departureCity + "  ----->>>   " + e.getKey().getIndirectCities().get(indirectCitiesListLength - 1) + " ||| through: " + city);
            }
        }
    }
}
