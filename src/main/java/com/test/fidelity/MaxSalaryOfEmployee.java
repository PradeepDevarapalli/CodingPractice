package com.test.fidelity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class MaxSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"abc", 50.0),
                new Employee(2,"def", 500.0),
                new Employee(3,"ghi", 550.0)
        );

        System.out.println("Max salary is: " +findMaxSalary(employeeList).salary);
        System.out.println("Second max salary:" +findSecondMaxSalary(employeeList));
    }

    private static Employee findMaxSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .max(Comparator.comparingDouble(employee -> employee.salary))
                .get();
    }

    private static double findSecondMaxSalary(List<Employee> employeeList) {
        Optional<Double> second =  employeeList.stream()
                .map(employee -> employee.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        return second.orElse(0.0);
    }
}
