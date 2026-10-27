package com.pluralsight;

public class Employee {
    private String employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(String employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public Employee(String employeeID, String name) {
        this(employeeID, name, 0, 0);
    }

    public Employee(String employeeID) {
        this(employeeID, "");
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

}
