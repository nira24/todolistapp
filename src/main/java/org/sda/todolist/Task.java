package org.sda.todolist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task {
    private String TaskName;
    private String ProjectName;
    private String TaskStatus;
    private Date TaskDate;

    public Task(String TaskName, String ProjectName, String TaskStatus, Date TaskDate)
    {
        this.TaskName = TaskName;
        this.ProjectName = ProjectName;
        this.TaskStatus = TaskStatus;
        this.TaskDate = TaskDate;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String setTaskName) {
        TaskName = setTaskName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String setProjectName) {
        ProjectName = setProjectName;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String setTaskStatus) {
        TaskStatus = setTaskStatus;
    }

    public Date getTaskDate() {
        return TaskDate;
    }

    public void setTaskDate(Date setTaskDate) {
        TaskDate = setTaskDate;
    }
}