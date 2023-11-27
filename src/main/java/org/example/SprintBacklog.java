package org.example;

import org.example.Tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class SprintBacklog {
    static List<Task> listTask =new ArrayList<>();
    private int capacity;

    public SprintBacklog(int capacity) {
        this.capacity = capacity;
    }

    public SprintBacklog() {
    }

    public void addTask(Task task) {
        if(listTask.size()>=capacity){
            System.out.println("Spring Backlog is full");
        }
        else {
            listTask.add(task);
        }
    }

    public List<Task> getListTask() {
        return listTask;
    }

    public void deleteTask(Task task) {
        if (listTask.contains(task)) {
            listTask.remove(task);
        } else {
            System.out.println("SpringBacklog don`t have this task!!!");
        }

    }
}
