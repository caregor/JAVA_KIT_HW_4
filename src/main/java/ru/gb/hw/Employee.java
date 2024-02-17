package ru.gb.hw;

public class Employee {
    private static int nextId = 1000;
    private int employeeId;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(String phoneNumber, String name, int experience) {
        this.employeeId = nextId++;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

