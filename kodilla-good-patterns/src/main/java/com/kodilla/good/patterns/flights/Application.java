package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {

        SearchFlight searcher = new SearchFlight();
        FlightsDatabase flightsDatabase = new FlightsDatabase();

        searcher.process(flightsDatabase);
    }
}
