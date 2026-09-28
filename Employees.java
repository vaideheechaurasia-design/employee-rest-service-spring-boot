package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}