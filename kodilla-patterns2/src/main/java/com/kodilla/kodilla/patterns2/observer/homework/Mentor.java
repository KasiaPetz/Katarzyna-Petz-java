package com.kodilla.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void updateStatus(StudentTasksQuequ studentTasksQuequ) {
        System.out.println(name + " there is new task to check " + studentTasksQuequ.getTasks() + " from " +
                studentTasksQuequ.getStudent().getName() + ".");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
