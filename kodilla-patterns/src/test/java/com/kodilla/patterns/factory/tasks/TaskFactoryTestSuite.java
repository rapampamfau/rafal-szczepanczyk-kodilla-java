package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {


    private final TaskFactory factory = new TaskFactory();

    @Test
    void testShoppingTask() {
        //Given
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        //When
        String task = shoppingTask.getTaskName();
        shoppingTask.executeTask();

        //Then
        assertEquals("The shopping task", task);
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);

        //When
        String task = paintingTask.getTaskName();
        paintingTask.executeTask();

        //Then
        assertEquals("The painting task", task);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testDrivingTask() {
        //Given
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);

        //When
        String task = drivingTask.getTaskName();
        drivingTask.executeTask();

        //Then
        assertEquals("The driving task", task);
        assertTrue(drivingTask.isTaskExecuted());
    }
}
