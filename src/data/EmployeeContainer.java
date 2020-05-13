package data;

import data.Employee;

import java.util.ArrayList;

public class EmployeeContainer {
    private ArrayList<Employee> employees;

    public EmployeeContainer() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeLineInfo){
        employees.add(new Employee(employeeLineInfo.split(";")));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "EmployeeContainer{" +
                "employees=" + employees +
                '}';
    }
}
