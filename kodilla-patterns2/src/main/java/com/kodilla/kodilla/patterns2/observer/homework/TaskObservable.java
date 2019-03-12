package com.kodilla.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void registerTaskObserver(TasksObserver tasksObserver);
    void notifyTaskObservers();
    void removeTaskObserver(TasksObserver tasksObserver);
}
