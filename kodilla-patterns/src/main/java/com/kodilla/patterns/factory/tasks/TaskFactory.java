package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Do shopping", "eggs", 10.0);
            case PAINTING:
                return new PaintingTask("Paint", "black", "table");
            case DRIVING:
                return new DrivingTask("Drive", "Warszawa", "car");
             default:
                 return null;
        }
    }
}
