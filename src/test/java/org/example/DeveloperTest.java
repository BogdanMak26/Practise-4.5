package org.example;

import org.example.Tasks.Status;
import org.example.Tasks.Task;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DeveloperTest {

    @Test
    void getTaskFromSpringBacklog() {
        Developer developer = new Developer();
        SprintBacklog sprintBacklog = new SprintBacklog(2);
        sprintBacklog.addTask(Task.createTask());
        sprintBacklog.addTask(Task.createTask());
        String input = "0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        developer.getTaskFromSpringBacklog();
        assertEquals(Status.VALIDATE, developer.getCurrentTask().getStatus());
        assertEquals(sprintBacklog.getListTask().get(0), developer.getCurrentTask());
    }

    @Test
    void getScorePoin(){
        Developer developer = new Developer();
        SprintBacklog sprintBacklog = new SprintBacklog(2);
        sprintBacklog.addTask(Task.createTask());
        sprintBacklog.addTask(Task.createTask());
        String input = "0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        developer.getTaskFromSpringBacklog();
        String input1 = "1";
        System.setIn(new ByteArrayInputStream(input1.getBytes()));
        developer.getTaskFromSpringBacklog();
        assertEquals( sprintBacklog.getListTask().stream().mapToInt(Task::getStoryPoint).sum(),developer.getScorePoin());


    }


}