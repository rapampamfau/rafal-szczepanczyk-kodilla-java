package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class SearchFlight {

    Scanner scan = new Scanner(System.in);
    private int optionNumber;
    private String city;

    public void process(FlightsDatabase database) {
        System.out.println("        <<< --- FLIGHT FINDER --- >>>"
                + "\nFinding all flights from the given city  ---  press 1"
                + "\nFinding all flights to the given city  ---  press 2"
                + "\nFinding flights through another given city  ---  press 3");
        optionNumber = scan.nextInt();

        if (optionNumber == 1) {
            System.out.println("Enter city you want to travel from: ");
            city = scan.next();
            Engine.showFlightsFromEnteredCity(city, database.getFlights());

        } else if (optionNumber == 2) {
            System.out.print("Enter city which you want to reach: ");
            city = scan.next();
            Engine.showFlightsToEnteredCity(city, database.getFlights());

        } else if (optionNumber == 3) {
            System.out.println("Enter city which is between departure city and arrival city: ");
            city = scan.next();
            Engine.showFlightsThroughEnteredCity(city, database.getFlights());
        }
    }
}
