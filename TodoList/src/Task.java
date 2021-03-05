import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String TaskName;
    private String  ProjectName;
    private String Status;
    private Date TaskDate;

    public Task(String TaskName, String ProjectName, String Status, Date TaskDate) {
        this.TaskName = TaskName;
        this.ProjectName = ProjectName;
        this.Status = Status;
        this.TaskDate = TaskDate;
    }

    public String getTaskName() {
        return TaskName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public String getStatus() {
        return Status;
    }

    public Date getTaskDate() {
        return TaskDate;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setTaskDate(Date taskDate) {
        TaskDate = taskDate;
    }
}
