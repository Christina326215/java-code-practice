package com.sunnyhsu.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Ann",60000.00, LocalDate.of(2020,1,2), 25));
        employees.add(new Employee(102,"Bob",47000.00, LocalDate.of(2025,2,2),30));
        employees.add(new Employee(103,"Cindy",48000.00, LocalDate.of(2024,10,8),22));
        employees.add(new Employee(104,"Dolly",50000.00, LocalDate.of(2023,5,17),45));
        employees.add(new Employee(105,"Emma",58000.00, LocalDate.of(2021,6,6),32));

        System.out.println("Employees 1 : " + employees.get(0).getId());
        System.out.println("Employees 2 : " + employees.get(1).getId());
        System.out.println("Employees 3 : " + employees.get(2).getId());
        System.out.println("Employees 4 : " + employees.get(3).getId());
        System.out.println("Employees 5 : " + employees.get(4).getId());
        System.out.println("---------------------------");

        // 按員工的名字排序
        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(employees, employeeNameComparator);
        System.out.println("Employees(Sorted by Name) 1 : " + employees.get(0).getId());
        System.out.println("Employees(Sorted by Name) 2 : " + employees.get(1).getId());
        System.out.println("Employees(Sorted by Name) 3 : " + employees.get(2).getId());
        System.out.println("Employees(Sorted by Name) 4 : " + employees.get(3).getId());
        System.out.println("Employees(Sorted by Name) 5 : " + employees.get(4).getId());
        System.out.println("---------------------------");

        //按員工的工資排序
        Comparator<Employee> employeeSalaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() < e2.getSalary()) {
                    return -1;
                } else if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(employees, employeeSalaryComparator);
        System.out.println("Employees(Sorted by Salary) 1 : " + employees.get(0).getId());
        System.out.println("Employees(Sorted by Salary) 2 : " + employees.get(1).getId());
        System.out.println("Employees(Sorted by Salary) 3 : " + employees.get(2).getId());
        System.out.println("Employees(Sorted by Salary) 4 : " + employees.get(3).getId());
        System.out.println("Employees(Sorted by Salary) 5 : " + employees.get(4).getId());
        System.out.println("---------------------------");

        //按員工加入的日期排序
        Comparator<Employee> employeeJoiningDateComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getJoiningDate().compareTo(e2.getJoiningDate());
            }
        };

        Collections.sort(employees, employeeJoiningDateComparator);
        System.out.println("Employees(Sorted by JoiningDate) 1 : " + employees.get(0).getId());
        System.out.println("Employees(Sorted by JoiningDate) 2 : " + employees.get(1).getId());
        System.out.println("Employees(Sorted by JoiningDate) 3 : " + employees.get(2).getId());
        System.out.println("Employees(Sorted by JoiningDate) 4 : " + employees.get(3).getId());
        System.out.println("Employees(Sorted by JoiningDate) 5 : " + employees.get(4).getId());
        System.out.println("---------------------------");

        //按員工年齡排序 使用 Lambda
        Comparator<Employee> employeeAgeComparator = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());
        Collections.sort(employees, employeeAgeComparator);
        System.out.println("Employees(Sorted by Age) 1 : " + employees.get(0).getId());
        System.out.println("Employees(Sorted by Age) 2 : " + employees.get(1).getId());
        System.out.println("Employees(Sorted by Age) 3 : " + employees.get(2).getId());
        System.out.println("Employees(Sorted by Age) 4 : " + employees.get(3).getId());
        System.out.println("Employees(Sorted by Age) 5 : " + employees.get(4).getId());
        System.out.println("---------------------------");

    }
}

//Employees 1 : 101
//Employees 2 : 102
//Employees 3 : 103
//Employees 4 : 104
//Employees 5 : 105
//---------------------------
//Employees(Sorted by Name) 1 : 101
//Employees(Sorted by Name) 2 : 102
//Employees(Sorted by Name) 3 : 103
//Employees(Sorted by Name) 4 : 104
//Employees(Sorted by Name) 5 : 105
//---------------------------
//Employees(Sorted by Salary) 1 : 102
//Employees(Sorted by Salary) 2 : 103
//Employees(Sorted by Salary) 3 : 104
//Employees(Sorted by Salary) 4 : 105
//Employees(Sorted by Salary) 5 : 101
//---------------------------
//Employees(Sorted by JoiningDate) 1 : 101
//Employees(Sorted by JoiningDate) 2 : 105
//Employees(Sorted by JoiningDate) 3 : 104
//Employees(Sorted by JoiningDate) 4 : 103
//Employees(Sorted by JoiningDate) 5 : 102
//---------------------------
//Employees(Sorted by Age) 1 : 103
//Employees(Sorted by Age) 2 : 101
//Employees(Sorted by Age) 3 : 102
//Employees(Sorted by Age) 4 : 105
//Employees(Sorted by Age) 5 : 104
//---------------------------
