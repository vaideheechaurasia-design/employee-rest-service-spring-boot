package com.example.restservice;

public class EmployeeManager {

    private final Employees employees;

    public EmployeeManager() {
        employees = new Employees();

        employees.getEmployees().add(
            new Employee(1, "John", "Smith",
                    "john.smith@example.com", "Software Developer")
        );

        employees.getEmployees().add(
            new Employee(2, "Alice", "Brown",
                    "alice.brown@example.com", "Project Manager")
        );

        employees.getEmployees().add(
            new Employee(3, "Robert", "Johnson",
                    "robert.johnson@example.com", "System Administrator")
        );

        employees.getEmployees().add(
            new Employee(4, "Emma", "Davis",
                    "emma.davis@example.com", "Software Engineer")
        );
    }

    public Employees getEmployees() {
        return employees;
    }
}
