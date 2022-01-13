package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName(
            "Created emptyNumberList and checking if contains no elements"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyNumberList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        boolean emptyList = emptyNumberList.isEmpty();
        boolean expectedResult = true;
        //Then
        Assertions.assertEquals(emptyList, expectedResult);
    }

    @DisplayName(
            "When created normalList with even and odd numbers, " +
            "then exterminate method should return only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> normalListResult = oddNumbersExterminator.exterminate(normalList);
        //When
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        //Then
        Assertions.assertEquals(normalListResult, expectedList);
    }
}
