package com.kodilla.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentTasksQuequ implements TaskObservable {
    private final List<TasksObserver> tasksObservers;
    private final ArrayDeque<String> tasks;
    private final Student student;

    public StudentTasksQuequ(Student student) {
        tasksObservers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.student = student;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyTaskObservers();
    }

    @Override
    public void registerTaskObserver(TasksObserver tasksObserver) {
        tasksObservers.add(tasksObserver);
    }

    @Override
    public void notifyTaskObservers() {
        for(TasksObserver tasksObserver : tasksObservers) {
            tasksObserver.updateStatus(this);
        }
    }

    @Override
    public void removeTaskObserver(TasksObserver tasksObserver) {
        tasksObservers.remove(tasksObserver);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public Student getStudent() {
        return student;
    }
}
