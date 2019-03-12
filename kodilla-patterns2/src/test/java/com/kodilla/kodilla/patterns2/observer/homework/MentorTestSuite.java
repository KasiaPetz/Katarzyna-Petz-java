package com.kodilla.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdateStatus() {
        //Given
        StudentTasksQuequ marekMareckiTasks = new StudentTasksQuequ(new Student("Marek Marecki"));
        StudentTasksQuequ olaNowakTasks = new StudentTasksQuequ(new Student("Ola Nowak"));
        StudentTasksQuequ kasiaKowalskaTasks = new StudentTasksQuequ(new Student("Kasia Kowalska"));
        Mentor bartekBartnicki = new Mentor("Bartek Bartnicki");
        Mentor darekJarek = new Mentor("Darek Jarek");

        marekMareckiTasks.registerTaskObserver(bartekBartnicki);
        olaNowakTasks.registerTaskObserver(bartekBartnicki);
        kasiaKowalskaTasks.registerTaskObserver(darekJarek);

        //When
        marekMareckiTasks.addTask("task 1");
        marekMareckiTasks.addTask("task 2");
        marekMareckiTasks.addTask("task 3");
        olaNowakTasks.addTask("task 1");
        kasiaKowalskaTasks.addTask("task 1");

        //Then
        assertEquals(4, bartekBartnicki.getUpdateCount());
        assertEquals(1,darekJarek.getUpdateCount());
    }

}