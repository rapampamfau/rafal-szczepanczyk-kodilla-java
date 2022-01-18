package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@DisplayName("Tests for statistics")
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = ("Name " + n);
            resultList.add(theUser);
        }
        return resultList;
    }


    @Test
    @DisplayName("Tests case when 0 posts")
    void testCalculateAdvStatisticsWhen0Posts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.getPostsQuantity();

        // Then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Tests case when 1000 posts")
    void testCalculateAdvStatisticsWhen1000Posts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.getPostsQuantity();

        // Then
        assertEquals(1000, result);
    }

    @Test
    @DisplayName("Tests case when 0 comments")
    void testCalculateAdvStatisticsWhen0Comments() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.getCommentsQuantity();

        // Then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Tests case when comments quantity is lower than posts quantity")
    void testCalculateAdvStatisticsWhenCommentsQuantityIsLowerThanPostsQuantity() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(100);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = (int) calculateStatistics.getAverageCommentsQuantityPerPost();

        // Then
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Tests case when comments quantity is higher than posts quantity")
    void testCalculateAdvStatisticsWhenCommentsQuantityIsHigherThanPostsQuantity() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = (int) calculateStatistics.getAverageCommentsQuantityPerPost();

        // Then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Tests case when 0 users")
    void testCalculateAdvStatisticsWhen0Users() {
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> resultListOf0Users = generateListOfNUsers(0);
        when(statisticsMock.usersNames()).thenReturn(resultListOf0Users);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.getUsersQuantity();

        // Then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Tests case when 100 users")
    void testCalculateAdvStatisticsWhen100Users() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> resultListOf100Users = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.getUsersQuantity();

        // Then
        assertEquals(100, result);
    }
}
