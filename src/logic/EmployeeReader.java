package logic;

import data.EmployeeContainer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeReader {

    private String fileName;
    private EmployeeContainer employeeContainer;

    public EmployeeReader(String fileName, EmployeeContainer employeeContainer) {
        this.fileName = fileName;
        this.employeeContainer = employeeContainer;
    }

    public void readEmployeesFromFile(){
        try(
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ){
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                employeeContainer.addEmployee(nextLine);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
