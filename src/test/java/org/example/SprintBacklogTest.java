package org.example;

import org.example.Tasks.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SprintBacklogTest {

    @Test
    void addTask() {
        SprintBacklog sprintBacklog = new SprintBacklog(2);
        sprintBacklog.addTask(Task.createTask());
        assertEquals(1, sprintBacklog.getListTask().size());
    }

    @Test
    void deleteTask() {
        SprintBacklog sprintBacklog = new SprintBacklog(2);
        Task task1 = Task.createTask();
        Task task2 = Task.createTask();
        sprintBacklog.addTask(task1);
        sprintBacklog.deleteTask(task1);
        assertEquals(0, sprintBacklog.getListTask().size());
    }
}