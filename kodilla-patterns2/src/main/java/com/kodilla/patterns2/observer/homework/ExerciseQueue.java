package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ExerciseQueue implements Observable {

    private final List<Observer> observers;
    private ArrayDeque<Exercise> exercises;
    private final Student student;

    public ExerciseQueue(Student student) {
        observers = new ArrayList<>();
        exercises = new ArrayDeque<>();
        this.student = student;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public ArrayDeque<Exercise> getExercises() {
        return exercises;
    }

    public Student getStudent() {
        return student;
    }
}
