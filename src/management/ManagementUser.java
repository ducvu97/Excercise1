package management;

import model.employee.Employee;

import java.util.ArrayList;

public class ManagementUser {
    public final static ArrayList<Employee> employeeList = listLoad();

    public static ArrayList<Employee> listLoad(){
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        return employeeArrayList;
    }

    public Employee createEmployee(Employee employee){
        listLoad().add(employee);
        return employee;
    }

    public Employee editEmployee(int index, Employee employee){
        listLoad().set(index, employee);
        return employee;
    }

    public void deleteEmployee(int index){
        listLoad().remove(index);
    }

    public Employee findByName(String fullName){
        for (Employee employee :employeeList) {
            if (employee.getFullName().equals(fullName)){
                return employee;
            }
        }
        return null;
    }


}
