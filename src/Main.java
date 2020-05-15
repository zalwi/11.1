import data.Employee;
import logic.EmployeeReader;
import logic.EmployeesOperator;
import logic.ReportCreator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Stwórz nową listę pracowników na podstawie danych z pliku
        ArrayList<Employee> employees = EmployeeReader.readEmployeesFromFile("data.csv");
        //Generuj statystyki i zapisz do pliku raportu
        ReportCreator.generateReport("report.txt",EmployeesOperator.generateStats(employees));
    }
}
