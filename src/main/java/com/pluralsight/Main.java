package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input the file name of the spreadsheet you want to display.");
        System.out.println("Options: employees.csv");
        parsePrintCSV(myScanner);
    }

    public static void parsePrintCSV(Scanner scanner) {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(scanner.nextLine()));
            String inputLine = buffReader.readLine();
            while((inputLine = buffReader.readLine()) != null) {
                String[] input = inputLine.split("\\|");
                for (int i = 0; i < input.length; i++) {
                    input[i] = input[i].trim();
                }
                Employee employee = new Employee(input[0], input[1]);
                employee.setHoursWorked(Double.parseDouble(input[2]));
                employee.setPayRate(Double.parseDouble(input[3]));
                printEmployee(employee);
            }
            buffReader.close();
        }
        catch (Exception e) {
            System.out.println("Not a valid file name. Exiting Program.");
        }
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("ID: %s%n Name: %s%n Gross Pay: $%.2f%n",
                          employee.getEmployeeID(),
                          employee.getName(),
                          employee.getGrossPay()
                         );
    }
}
