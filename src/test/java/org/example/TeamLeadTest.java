package org.example;

import org.example.Tasks.Status;
import org.example.Tasks.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamLeadTest {

    @Test
    void moveTaskFromSpringToProductBacklog() {
        ProductBacklog productBacklog = new ProductBacklog();
        SprintBacklog sprintBacklog = new SprintBacklog(1);
        Task task = Task.createTask();
        productBacklog.addTask(task);
        TeamLead teamLead = new TeamLead();
        teamLead.moveTaskFromSpringToProductBacklog(productBacklog, sprintBacklog, task);
        assertTrue(productBacklog.getQueue().isEmpty());
        Assertions.assertTrue(sprintBacklog.getListTask().contains(task));
    }

    @Test
    void markDone() {
        Task task = Task.createTask();
        TeamLead teamLead = new TeamLead();
        teamLead.markDone(task);
        assertEquals(Status.DONE, task.getStatus());
    }

    @Test
    void inspectSpringBacklog() {
        SprintBacklog sprintBacklog = new SprintBacklog(2);
        Task task1 = Task.createTask();
        Task task2 = Task.createTask();
        sprintBacklog.addTask(task1);
        sprintBacklog.addTask(task2);
        TeamLead teamLead = new TeamLead();
        task1.setStatus(Status.DONE);
        teamLead.inspectSpringBacklog(sprintBacklog);

        assertFalse(sprintBacklog.getListTask().contains(task1));
        assertTrue(sprintBacklog.getListTask().contains(task2));

    }
}