import data.Employee;
import data.EmployeeContainer;
import logic.EmployeeReader;
import logic.EmployeesOperator;
import logic.StatisticsGenerator;

public class Main {
    public static void main(String[] args) {
        //Stwórz kontener pracowników
        EmployeeContainer testEmployees = new EmployeeContainer();
        //Utwórz reader do danych pracowników
        EmployeeReader newEmployees = new EmployeeReader("data.csv", testEmployees);
        //Wczytaj dane
        newEmployees.readEmployeesFromFile();
        //Utwórz operatora pracowników
        EmployeesOperator statistics = new EmployeesOperator(testEmployees);
        //Utwórz generator raportów
        StatisticsGenerator reportGenerator = new StatisticsGenerator("report.txt");
        //Generuj statystyki i zapisz do pliku raportu
        reportGenerator.generateReport(statistics.generateStats());
    }

}
