package lessons.homework.employees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeProgram {
    public static void main(String[] args) {
        List<Employee> employees = readEmployeesFromCSV("C:\\Users\\Akmal\\IT\\Java\\SmartUpAcademy\\src\\lessons\\classes\\employees.csv");

        // Calculate and print pay for each employee
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Pay: $" + pay);
        }
    }

    private static List<Employee> readEmployeesFromCSV(String fileName) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                double salary = Double.parseDouble(values[2]);

                // Create the appropriate subclass based on the data in the CSV file
                if (values[3].equals("Manager")) {
                    employees.add(new Manager(name, age, salary));
                } else if (values[3].equals("Salesperson")) {
                    employees.add(new Salesperson(name, age, salary));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}

