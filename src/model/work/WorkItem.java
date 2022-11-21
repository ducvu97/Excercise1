package model.work;

public class WorkItem {
    private Epic epic;
    private int idEmployee;
    private String fullName;

    public WorkItem(Epic epic, int idEmployee, String fullName) {
        this.epic = epic;
        this.idEmployee = idEmployee;
        this.fullName = fullName;
    }

    public Epic getEpic() {
        return epic;
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
