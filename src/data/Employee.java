package data;

public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String department;
    private int salary;

    public Employee(String[] employeeInformations) {
        this.firstName  = employeeInformations[0].toString();
        this.lastName   = employeeInformations[1].toString();
        this.pesel      = employeeInformations[2].toString();
        this.department = employeeInformations[3].toString();
        this.salary     = Integer.parseInt(employeeInformations[4].toString());
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
