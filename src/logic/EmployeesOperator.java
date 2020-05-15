package logic;

import data.Employee;
import java.util.*;

public abstract class EmployeesOperator {

    public static String generateStats(ArrayList<Employee> employees){
        String content = "";
        ArrayList<Integer> salaries = new ArrayList<>();
        ArrayList<String> departments = new ArrayList<>();
        Set<String> uniqueDepartments = new TreeSet<>();

        for(Employee emp: employees){
            salaries.add(emp.getSalary());
            departments.add(emp.getDepartment());
            uniqueDepartments.add(emp.getDepartment());
        }

        content += "Średnia wypłata: " + averageSalary(employees) + "\n";
        content += "Najmniejsza wypłata: " + Collections.min(salaries) + "\n";
        content += "Największa wypłata: " + Collections.max(salaries) + "\n";
        content += "Łączna liczba pracowników: " + salaries.size() + "\n";

        for(String uniqDep: uniqueDepartments){
            content += "Liczba pracowników w dziale " + uniqDep + ": " +
                                Collections.frequency(departments,uniqDep) + "\n";
        }
        return content;
    }

    private static int averageSalary(ArrayList<Employee> employees){
        int sum = 0;
        for(Employee emp: employees){
            sum += emp.getSalary();
        }
        return (sum/employees.size());
    }
}
