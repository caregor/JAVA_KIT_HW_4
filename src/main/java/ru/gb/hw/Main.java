package ru.gb.hw;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        Employee employee1 = new Employee("555123", "Ivan", 5);
        Employee employee2 = new Employee("654234", "Rolan", 18);
        Employee employee3 = new Employee("887124", "Artsiom", 46);
        Employee employee4 = new Employee("094146", "Serhei", 46);

        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);
        directory.addEmployee(employee4);

        System.out.println("Список всех сотрудников со стажем 46 месяцев:");
        for (Employee employee : directory.findEmployeesByExperience(46)) {
            printEmployer(employee);
        }

        System.out.println("Поиск номера телефона по иммени: Ivan");
        System.out.println(directory.findPhoneNumberByName("Ivan"));
        System.out.println();

        System.out.println("Поиск работника по табельному номеру:");
        printEmployer(directory.findEmployeeById(1001));

    }
    public static void printEmployer(Employee employee){
        if(employee != null) {
            System.out.println("Табельный номер: " + employee.getEmployeeId());
            System.out.println("Имя: " + employee.getName());
            System.out.println("Номер телефона: " + employee.getPhoneNumber());
            System.out.println("Стаж: " + employee.getExperience());
            System.out.println();
        }
    }
}