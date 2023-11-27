package org.example;

import org.example.Tasks.Status;
import org.example.Tasks.Task;

public class TeamLead extends Developer {
    private final Position position = Position.TEAM_LEAD;
    public TeamLead(String name , String lastName , int salary){
        super(name,lastName, salary);
    }

    public TeamLead() {

    }

    public void moveTaskFromSpringToProductBacklog(ProductBacklog productBacklog, SprintBacklog sprintBacklog, Task task) {
        productBacklog.deleteTask();
        sprintBacklog.addTask(task);
    }

    public void markDone(Task task) {
        task.setStatus(Status.DONE);
    }

    public void inspectSpringBacklog(SprintBacklog sprintBacklog) {
        for (var task : sprintBacklog.getListTask()) {
            if (task.getStatus() == Status.DONE) {
                sprintBacklog.deleteTask(task);
            }
        }
    }


}



