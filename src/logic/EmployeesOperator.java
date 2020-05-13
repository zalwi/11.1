package logic;

import data.Employee;
import data.EmployeeContainer;

import java.util.*;

public class EmployeesOperator {
    EmployeeContainer employeeContainer;

    public EmployeesOperator(EmployeeContainer employeeContainer) {
        this.employeeContainer = employeeContainer;
    }

    public void generateStats(){
        ArrayList<Integer> salaries = new ArrayList<>();
        ArrayList<String> departments = new ArrayList<>();
        Set<String> uniqueDepartments = new TreeSet<>();

        for(Employee emp: employeeContainer.getEmployees()){
            salaries.add(emp.getSalary());
            departments.add(emp.getDepartment());
            uniqueDepartments.add(emp.getDepartment());
        }

        System.out.println("Średnia wypłata: " + averageSalary());
        System.out.println("Najmniejsza wypłata: " + Collections.min(salaries));
        System.out.println("Największa wypłata: " + Collections.max(salaries));
        System.out.println("Łączna liczba pracowników: " + salaries.size());

        for(String uniqDep: uniqueDepartments){
            System.out.println("Liczba pracowników w dziale " + uniqDep + ": " +
                                Collections.frequency(departments,uniqDep));
        }
    }

    private int averageSalary(){
        int sum = 0;
        for(Employee emp: employeeContainer.getEmployees()){
            sum += emp.getSalary();
        }
        return (sum/employeeContainer.getEmployees().size());
    }
}
