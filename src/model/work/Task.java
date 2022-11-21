package model.work;

public class Task extends Work{
    private String state;
    private String area;
    private String iteration;
    private String team;
    private int priority;
    private int estimate;
    private int remainWork;
    private int taskPoint;

    public Task(String description, String discussion, String acceptanceCriteria, String title, String state, String area, String iteration, String team, int priority, int estimate, int remainWork, int taskPoint) {
        super(description, discussion, acceptanceCriteria, title);
        this.state = state;
        this.area = area;
        this.iteration = iteration;
        this.team = team;
        this.priority = priority;
        this.estimate = estimate;
        this.remainWork = remainWork;
        this.taskPoint = taskPoint;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIteration() {
        return iteration;
    }

    public void setIteration(String iteration) {
        this.iteration = iteration;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public int getRemainWork() {
        return remainWork;
    }

    public void setRemainWork(int remainWork) {
        this.remainWork = remainWork;
    }

    public int getTaskPoint() {
        return taskPoint;
    }

    public void setTaskPoint(int taskPoint) {
        this.taskPoint = taskPoint;
    }
}
