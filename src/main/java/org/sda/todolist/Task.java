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

    // Return TaskName
    public String getTaskName() {
        return TaskName;
    }

    // Set TaskName
    public void setTaskName(String setTaskName) {
        TaskName = setTaskName;
    }

    // Return ProjectName
    public String getProjectName() {
        return ProjectName;
    }

    // Set ProjectName
    public void setProjectName(String setProjectName) {
        ProjectName = setProjectName;
    }

    // Return TaskStatus
    public String getTaskStatus() {
        return TaskStatus;
    }

    // Set TaskStatus
    public void setTaskStatus(String setTaskStatus) {
        TaskStatus = setTaskStatus;
    }

    // Return TaskDate
    public Date getTaskDate() {
        return TaskDate;
    }

    // Set TaskDate
    public void setTaskDate(Date setTaskDate) {
        TaskDate = setTaskDate;
    }
}