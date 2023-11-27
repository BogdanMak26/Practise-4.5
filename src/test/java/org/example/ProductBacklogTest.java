package org.example;

import org.example.Tasks.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBacklogTest {

    @Test
    void addTask() {
        ProductBacklog productBacklog = new ProductBacklog();
        Task task = Task.createTask();
        productBacklog.addTask(task);
        assertEquals(1,productBacklog.getQueue().size());
    }

    @Test
    void deleteTask() {
        ProductBacklog productBacklog = new ProductBacklog();
        Task task = Task.createTask();
        productBacklog.getQueue().poll();
        assertEquals(0,productBacklog.getQueue().size());
    }

    @Test
    void moveTask() {
    }
}