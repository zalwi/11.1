import data.Employee;
import data.EmployeeContainer;
import logic.EmployeeReader;
import logic.EmployeesOperator;

public class Main {
    public static void main(String[] args) {
        EmployeeContainer testEmployees = new EmployeeContainer();
        EmployeeReader newEmployees = new EmployeeReader("data.csv", testEmployees);
        newEmployees.readEmployeesFromFile();
        EmployeesOperator statistics = new EmployeesOperator(testEmployees);
        statistics.generateStats();
    }

}
