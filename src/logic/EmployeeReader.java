package logic;

import data.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class EmployeeReader {

    public static void readEmployeesFromFile(String fileName, ArrayList<Employee> employees){
        try(
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ){
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                employees.add(new Employee(nextLine.split(";")));
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
