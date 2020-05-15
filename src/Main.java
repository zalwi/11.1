import data.Employee;
import logic.EmployeeReader;
import logic.EmployeesOperator;
import logic.ReportCreator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Stwórz nową listę pracowników
        ArrayList<Employee> employees = new ArrayList<>();;
        //Wczytaj dane pracowników z pliku
        EmployeeReader.readEmployeesFromFile("data.csv", employees);
        //Generuj statystyki i zapisz do pliku raportu
        ReportCreator.generateReport("report.txt",EmployeesOperator.generateStats(employees));
    }
}
