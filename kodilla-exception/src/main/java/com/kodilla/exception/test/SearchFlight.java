package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Malta", true);
        flights.put("Kiev", false);
        flights.put("London", true);
        flights.put("Amsterdam", false);

        boolean available = true;

        try {
            if (flights.get(flight.getArrivalAirport()) == available) {
                System.out.println(flight + " is available");
            }
        } catch (NullPointerException e) {
            throw new RouteNotFoundException("Flight doesn't exist");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Cracow", "Malta");
        Flight flight2 = new Flight("Warsaw", "New York");
        Flight flight3 = new Flight("Katowice", "London");
        Flight flight4 = new Flight("Warsaw", "Paris");

        SearchFlight searchFlight = new SearchFlight();
        try {
            searchFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem! " + e);
        }

        try {
            searchFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem! " + e);
        }

        try {
            searchFlight.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem! " + e);
        }

        try {
            searchFlight.findFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem! " + e);
        }
    }
}
