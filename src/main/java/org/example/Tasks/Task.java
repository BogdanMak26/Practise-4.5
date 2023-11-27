package org.example.Tasks;

import java.util.Random;

public class Task implements Comparable<Task>{
    static int id=1;
    private String name;
    private Status status;
    private int storyPoint;
    private Priority priority;

    public Task( String name,Status status, int storyPoint, Priority priority) {
        id++;
        this.name=name;
        this.status = status;
        this.storyPoint = storyPoint;
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public  int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority.ordinal(), o.priority.ordinal());
    }

    public static Task createTask() {
        int[] validStoryPoints = {1, 2, 3, 5, 8, 13, 20, 100};
        Random rand = new Random();
        int storyPoint = validStoryPoints[rand.nextInt(validStoryPoints.length)];
        String name = "task#" + id;
        Priority priority = Priority.values()[rand.nextInt(Priority.values().length)];
        return new Task(name, Status.TO_DO ,storyPoint,priority);

    }

    @Override
    public String toString() {
        return  " { " + name  +" | status : "+
                 status +" | Story point : "+
                storyPoint +" | prioriry : "+
                priority +" "+
                '}';
    }
}
