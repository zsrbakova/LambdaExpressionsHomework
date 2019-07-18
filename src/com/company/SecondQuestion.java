package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondQuestion {

    public static void main(String []args) {

        List<Employee> employeeList = GenerateEmployees.generateEmployees(40);

        int suma= employeeList.stream().filter(employee -> employee.getCity().equals("Skopje")).mapToInt(Employee::getSalary).sum();
        Map<String, List<Employee>> mapa2=employeeList.stream().filter(employee -> employee.getCity().equals("Skopje")).
                collect(Collectors.groupingBy(employee -> employee.getWorkingPosition(),Collectors.toList()));
        System.out.println(mapa2.entrySet()
                .stream()
                .map(entry->entry.getKey()+" - "+entry.getValue().toString())
                .collect(Collectors.joining("\n","","\n")));


        System.out.println("The sum of the salaries of all employees who live in Skopje is: "+ suma);
    }
    }

