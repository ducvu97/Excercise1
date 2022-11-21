package model.work;

import java.util.Date;

public class Epic extends Work{
    private Backlog backlog;
    private Bug bug;
    private Date startDate;
    private Date targetDate;

    public Epic(String description, String discussion, String acceptanceCriteria, String title, Backlog backlog, Bug bug, Date startDate, Date targetDate) {
        super(description, discussion, acceptanceCriteria, title);
        this.backlog = backlog;
        this.bug = bug;
        this.startDate = startDate;
        this.targetDate = targetDate;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
