package logic;

import data.Employee;

import java.util.ArrayList;

public class EmployeeContainer {
    ArrayList<Employee> employees;

    public EmployeeContainer() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeLineInfo){
        employees.add(new Employee(employeeLineInfo.split(";")));
    }

    @Override
    public String toString() {
        return "EmployeeContainer{" +
                "employees=" + employees +
                '}';
    }
}
