package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Exercise exercise1 = new Exercise("Unit tests");
        Exercise exercise2 = new Exercise("REST application");
        Exercise exercise3 = new Exercise("Spring introduction");
        Student johnSmith = new Student("John", "Smith");
        Student jessiePinkman = new Student("Jessie", "Pinkman");
        Mentor walterWhite = new Mentor("Walter", "White");
        Mentor carlosSainz = new Mentor("Carlos", "Sainz");
        ExerciseQueue johnSmithsQueue = new ExerciseQueue(johnSmith);
        ExerciseQueue jessiePinkmanQueue = new ExerciseQueue(jessiePinkman);
        johnSmithsQueue.registerObserver(carlosSainz);
        jessiePinkmanQueue.registerObserver(walterWhite);

        //When
        johnSmithsQueue.addExercise(exercise1);
        johnSmithsQueue.addExercise(exercise2);
        johnSmithsQueue.addExercise(exercise3);
        jessiePinkmanQueue.addExercise(exercise1);

        //Then
        assertEquals(3, carlosSainz.getUpdateCount());
        assertEquals(1, walterWhite.getUpdateCount());
    }
}
