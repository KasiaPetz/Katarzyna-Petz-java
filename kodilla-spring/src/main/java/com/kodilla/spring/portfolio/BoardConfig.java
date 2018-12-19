package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
   @Autowired
   @Qualifier("toDoList")
   TaskList toDoList;

   @Autowired
   @Qualifier("inProgressList")
   TaskList inProgressList;

   @Autowired
   @Qualifier("doneList")
   TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
    //utworzy trzy różne Beany reprezentujące listy zadań i wstrzyknie je do Beana klasy Board.
}
