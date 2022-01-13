package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> ListOfNumbers;

    public OddNumbersExterminator() {
        ListOfNumbers = new ArrayList<>();
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        for (Integer evenNumber: numbers) {
            if (evenNumber % 2 == 0) {
                ListOfNumbers.add(evenNumber);
            }
        } return ListOfNumbers;
    }

    public List<Integer> getListOfNumbers() {
        return ListOfNumbers;
    }
}
