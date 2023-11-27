package org.example;

import org.example.Tasks.Task;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProductBacklog {
    private PriorityQueue<Task> queue;

    public ProductBacklog() {
        queue = new PriorityQueue<>();
    }

    public PriorityQueue<Task> getQueue() {
        return queue;
    }

    public PriorityQueue<Task> addTask(Task task) {
        queue.add(task);
        return queue;
    }

    public void deleteTask() {
        queue.poll();
    }

//    public PriorityQueue<Task> moveTask(Task task) {
//        return null;
//    }

}
