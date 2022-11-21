package model.work;

public class Work {
    private String description;
    private String discussion;
    private String acceptanceCriteria;
    private String title;

    public Work(String description, String discussion, String acceptanceCriteria, String title) {
        this.description = description;
        this.discussion = discussion;
        this.acceptanceCriteria = acceptanceCriteria;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
