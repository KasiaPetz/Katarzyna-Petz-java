package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuit {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().getTasks().add("Done task");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getToDoList().getTasks().add("Task to do");

        //Then
        Assert.assertEquals(1,board.getDoneList().getTasks().size());
        Assert.assertEquals(1,board.getInProgressList().getTasks().size());
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
    }
}
