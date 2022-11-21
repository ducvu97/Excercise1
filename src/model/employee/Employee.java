package model.employee;

import model.work.Work;

public class Employee {
    private String idEmployee;
    private String fullName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String birthday;
    private User user;
    private Work work;

    public Employee(String idEmployee, String fullName, String gender, String address, String phoneNumber, String email, String birthday, User user, Work work) {
        this.idEmployee = idEmployee;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.user = user;
        this.work = work;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
