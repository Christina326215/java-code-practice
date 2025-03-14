package com.sunnyhsu.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Ann",60000.00, LocalDate.of(2020,1,2), 25));
        employees.add(new Employee(102,"Bob",47000.00, LocalDate.of(2025,2,2),30));
        employees.add(new Employee(103,"Cindy",48000.00, LocalDate.of(2024,10,8),22));
        employees.add(new Employee(104,"Dolly",50000.00, LocalDate.of(2023,5,17),45));
        employees.add(new Employee(105,"Emma",58000.00, LocalDate.of(2021,6,6),32));
        employees.add(new Employee(106,"Wendy",66000.00, LocalDate.of(2020,9,9),35));
        employees.add(new Employee(107,"Amy",51000.00, LocalDate.of(2023,3,7), 28));

        List<String> employeesNames = employees.stream()
                .filter(employee -> employee.getSalary() > 50000.00)
                .map(Employee::getName)
                .sorted()
                .toList();

        employeesNames.forEach(System.out::println);
        System.out.println("----------------------------------------");

        long count = (long)employees.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .distinct()
                .count();

        System.out.println("以 'A' 開頭、不重複、排序後，總共有: " + count + " 筆。");
        System.out.println("----------------------------------------");

    }
}

//Amy
//Ann
//Emma
//Wendy
//----------------------------------------
//以 'A' 開頭、不重複、排序後，總共有: 2 筆。
//----------------------------------------
