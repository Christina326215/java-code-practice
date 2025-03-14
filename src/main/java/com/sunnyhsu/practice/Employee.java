package com.sunnyhsu.practice;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    int id;
    String name;
    double salary;
    LocalDate joiningDate;
    int age;

    public Employee(int id, String name, double salary, LocalDate joiningDate, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
