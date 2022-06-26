package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private String surname;
    private int updateCount;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void update(ExerciseQueue exerciseQueue) {
        System.out.println(name + " " + surname + ": have " + exerciseQueue.getExercises().size() +
                " exercises to check made by: " + exerciseQueue.getStudent().getName() + " " +
                exerciseQueue.getStudent().getSurname());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
