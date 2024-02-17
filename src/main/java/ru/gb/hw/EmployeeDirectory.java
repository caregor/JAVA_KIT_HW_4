package ru.gb.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private static List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }
    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> findEmployeesByExperience(int experience) {
       return employees.stream().filter(x -> x.getExperience() == experience).collect(Collectors.toList());
    }

    public String findPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return null;
    }
}

