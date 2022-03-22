package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightsDatabase {

    public Map<Flight, List<String>> getFlights() {

        Flight flight1 = new Flight("Kraków", (Arrays.asList("Warszawa", "Poznań", "Kielce", "Gdańsk")));
        Flight flight2 = new Flight("Gdańsk", (Arrays.asList("Warszawa", "Poznań", "Kielce", "Kraków")));
        Flight flight3 = new Flight("Białystok", (Arrays.asList("Warszawa", "Poznań", "Wrocław")));
        Flight flight4 = new Flight("Wrocław", (Arrays.asList("Warszawa", "Poznań", "Białystok")));

        Map<Flight, List<String>> flights = new HashMap<>();
        flights.put(flight1, new ArrayList<>(Arrays.asList("Katowice", "Gdańsk")));
        flights.put(flight2, new ArrayList<>(Arrays.asList("Szczecin", "Kraków")));
        flights.put(flight3, new ArrayList<>(Arrays.asList("Suwałki", "Wrocław")));
        flights.put(flight4, new ArrayList<>(Arrays.asList("Opole", "Białystok")));

        return flights;
    }
}
