package com.kodilla.good.patterns.challenges;

public class ChallengesMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e + "!")
                .forEach(System.out::print);
    }
}
