import logic.EmployeeContainer;
import logic.EmployeeReader;

public class Main {
    public static void main(String[] args) {
        EmployeeContainer testEmployees = new EmployeeContainer();
        EmployeeReader newEmployees = new EmployeeReader("data.csv", testEmployees);
        newEmployees.readEmployeesFromFile();
        System.out.println(testEmployees.toString());
    }

}
