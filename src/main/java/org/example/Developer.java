package org.example;

import org.example.Position;
import org.example.Tasks.Status;
import org.example.Tasks.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Developer {
    private String name;
    private String lastName;
    private int salary;
    private Position position;
    private int countOfDoneTask;
    private int scorePoin;
    private List<Task>  taskslist = new ArrayList<>();
    private Task currentTask;

    public Developer(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Developer(String name, String lastName, int salary, Position position, int countOfDoneTask, int scorePoin, Task currentTask) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
        this.countOfDoneTask = countOfDoneTask;
        this.scorePoin = scorePoin;
        this.currentTask = currentTask;
    }

    public Developer() {
    }

    public List<Task> getTaskslist() {
        return taskslist;
    }

    public int getScorePoin() {
        int scorePoint = taskslist.stream().mapToInt(Task::getStoryPoint).sum();
        setScorePoin(scorePoint);
        return scorePoint;
    }

    public void setScorePoin(int scorePoin) {
        this.scorePoin = scorePoin;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void getTaskFromSpringBacklog() {
        System.out.println("Choose task from Spring Backlog ");
        SprintBacklog.listTask.forEach(x -> System.out.println(x));
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        SprintBacklog.listTask.get(choose).setStatus(Status.VALIDATE);
        setCurrentTask(SprintBacklog.listTask.get(choose));
        taskslist.add(SprintBacklog.listTask.get(choose));
    }

}
