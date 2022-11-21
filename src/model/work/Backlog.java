package model.work;

public class Backlog extends Work {
    private Task task;

    public Backlog(String description, String discussion, String acceptanceCriteria, String title, Task task) {
        super(description, discussion, acceptanceCriteria, title);
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
