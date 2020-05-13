package logic;

import data.Employee;
import data.EmployeeContainer;

import java.util.*;

public class EmployeesOperator {
    private EmployeeContainer employeeContainer;

    public EmployeesOperator(EmployeeContainer employeeContainer) {
        this.employeeContainer = employeeContainer;
    }

    public String generateStats(){
        String content = "";
        ArrayList<Integer> salaries = new ArrayList<>();
        ArrayList<String> departments = new ArrayList<>();
        Set<String> uniqueDepartments = new TreeSet<>();

        for(Employee emp: employeeContainer.getEmployees()){
            salaries.add(emp.getSalary());
            departments.add(emp.getDepartment());
            uniqueDepartments.add(emp.getDepartment());
        }

        content += "Średnia wypłata: " + averageSalary() + "\n";
        content += "Najmniejsza wypłata: " + Collections.min(salaries) + "\n";
        content += "Największa wypłata: " + Collections.max(salaries) + "\n";
        content += "Łączna liczba pracowników: " + salaries.size() + "\n";

        for(String uniqDep: uniqueDepartments){
            content += "Liczba pracowników w dziale " + uniqDep + ": " +
                                Collections.frequency(departments,uniqDep) + "\n";
        }
        return content;
    }

    private int averageSalary(){
        int sum = 0;
        for(Employee emp: employeeContainer.getEmployees()){
            sum += emp.getSalary();
        }
        return (sum/employeeContainer.getEmployees().size());
    }
}
