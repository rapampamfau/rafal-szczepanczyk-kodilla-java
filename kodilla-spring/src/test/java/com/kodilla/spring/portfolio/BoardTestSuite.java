package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Task 4");
        board.getDoneList().getTasks().add("Task 1 ");
        board.getInProgressList().getTasks().add("Task 3");

        //Then
        System.out.println("List with tasks to do: " + board.getToDoList().getTasks());
        System.out.println("List done tasks: " + board.getDoneList().getTasks());
        System.out.println("List with tasks in progress: " + board.getInProgressList().getTasks());
    }
}
