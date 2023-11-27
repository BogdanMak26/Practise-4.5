package org.example;

import org.example.Tasks.Task;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ProductBacklog productBacklog = new ProductBacklog();
        productBacklog.addTask(Task.createTask());
        Task task2 = (Task.createTask());
        productBacklog.addTask(task2);
        productBacklog.addTask(Task.createTask());
        System.out.println(productBacklog.getQueue().size());
        for (var a : productBacklog.getQueue()) {
            System.out.println(a);
        }
        System.out.println("___________________________");
        productBacklog.deleteTask();
        for (var a : productBacklog.getQueue()) {
            System.out.println(a);
        }
        System.out.println("___________________________");

        SprintBacklog sprintBacklog = new SprintBacklog(3);
        sprintBacklog.addTask(task2);
        sprintBacklog.addTask(Task.createTask());
        sprintBacklog.addTask(Task.createTask());
        for (var a : sprintBacklog.getListTask()) {
            System.out.println(a);
        }
        System.out.println("___________________________");
        Developer bogdan = new Developer();
        bogdan.getTaskFromSpringBacklog();
        System.out.println(bogdan.getCurrentTask());

    }
}