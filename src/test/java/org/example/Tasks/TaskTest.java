package org.example.Tasks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void createTask() {
        Task task = Task.createTask();
        assertNotNull(task);
        assertEquals(2, task.getId());
        assertNotNull(task.getPriority());
        assertNotNull(task.getStatus());
        assertNotNull(task.getStoryPoint());
    }

    @Test
    void testToString() {
    }
}