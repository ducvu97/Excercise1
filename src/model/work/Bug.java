package model.work;

public class Bug extends Work{
    private String SystemInfo;
    private Task task;

    public Bug(String description, String discussion, String acceptanceCriteria, String title) {
        super(description, discussion, acceptanceCriteria, title);
    }

    public String getSystemInfo() {
        return SystemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        SystemInfo = systemInfo;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
