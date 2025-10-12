package ru.safoev.organization;

import java.util.ArrayList;
import java.util.List;

public class Department {

    // Поля
    private String name1;
    private Employee manager;
    private List<Employee> employees;


    //Геттеры и сеттеры
    public String getName1() {
        return this.name1;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    //Конструктор
    public Department() {
        this.name1 = null;
        this.manager = null;
        this.employees = null;
    }

    public Department(String name1) {
        this.name1 = name1;
        this.manager = null;
        this.employees =new ArrayList<>();
    }

    //Метод to_string
    @Override
    public String toString() {
        return this.name1;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }


}
