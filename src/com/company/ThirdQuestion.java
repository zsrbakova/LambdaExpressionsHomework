package com.company;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ThirdQuestion {

    public static void main(String []args) {


        List<Employee> employeeList = GenerateEmployees.generateEmployees(10);
        Map<String,List<Employee>> mapa3=employeeList.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).
                collect(Collectors.groupingBy(employee->employee.getWorkingPosition(),Collectors.toList()));

        System.out.println("Employees sorted by salaries in ascending order: "+"\n");
        employeeList.sort(Comparator.comparing(employee -> employee.getSalary()));
        employeeList.forEach(System.out::println);

    }
    }

