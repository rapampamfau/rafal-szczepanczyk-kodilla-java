package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] listOfNumbers = new int[5];
        listOfNumbers[0] = 46;
        listOfNumbers[1] = 56;
        listOfNumbers[2] = 6;
        listOfNumbers[3] = 789;
        listOfNumbers[4] = 4;


        //When
        double result = ArrayOperations.getAverage(listOfNumbers);

        //Then
        assertEquals(180.2, result);

    }
}
