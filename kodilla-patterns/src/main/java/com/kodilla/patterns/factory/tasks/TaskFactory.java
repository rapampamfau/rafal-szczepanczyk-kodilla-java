package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("The shopping task", "CPU", 6);
            case PAINTING:
                return new PaintingTask("The painting task", "RED", "CAR");
            case DRIVING:
                return new DrivingTask("The driving task", "Home", "Bicycle");
            default:
                return null;
        }

    }
}
