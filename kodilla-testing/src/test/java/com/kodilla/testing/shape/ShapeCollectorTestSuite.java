package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for adding figure to list")
    class AddTest {
        @Test
        void testAddFigure() {
            //Given
            Shape square = new Square("Square", 144);
            Shape circle = new Circle("Circle", 42.2);
            Shape triangle = new Triangle("Triangle", 12);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);

            //Then
            assertEquals(3, collector.shapeList.size());
        }
    }

    @Nested
    @DisplayName("Test for removal figure from list")
    class RemoveTest {
        @Test
        void testRemoveFigure() {
            //Given
            Shape square = new Square("Square", 144);
            Shape circle = new Circle("Circle", 42.2);
            Shape triangle = new Triangle("Triangle", 12);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);

            //When
             collector.removeFigure(square);
             collector.removeFigure(circle);
             collector.removeFigure(triangle);

            //Then
            assertEquals(0, collector.shapeList.size());
        }
    }

    @Nested
    @DisplayName("Test for getting figure of the list")
    class GetTest {
        @Test
        void testGetFigure() {
            //Given
            Shape square = new Square("Square", 144);
            Shape circle = new Circle("Circle", 42.2);
            Shape triangle = new Triangle("Triangle", 12);
            ShapeCollector collector = new ShapeCollector();

            collector.shapeList.add(square);
            collector.shapeList.add(circle);
            collector.shapeList.add(triangle);

            //When
            Shape retrievedSquare = collector.getFigure(0);
            Shape retrievedCircle = collector.getFigure(1);
            Shape retrievedTriangle = collector.getFigure(2);

            //Then
            assertEquals(square, retrievedSquare);
            assertEquals(circle, retrievedCircle);
            assertEquals(triangle, retrievedTriangle);
        }
    }

    @Nested
    @DisplayName("Test for showing all figures in list")
    class ShowTest {
        @Test
        void testShowFigures() {
            //Given
            Shape square = new Square("Square", 144.0);
            Shape circle = new Circle("Circle", 42.2);
            Shape triangle = new Triangle("Triangle", 12.0);
            ShapeCollector collector = new ShapeCollector();
            collector.shapeList.add(square);
            collector.shapeList.add(circle);
            collector.shapeList.add(triangle);

            //When
            String result = collector.showFigures();

            //Then
            assertEquals("Square = 144.0, Circle = 42.2, Triangle = 12.0", result);
        }
    }
}
