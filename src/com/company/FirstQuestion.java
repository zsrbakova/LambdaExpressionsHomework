package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstQuestion {

    public static void main(String []args) {

        List<Employee> employeeList = GenerateEmployees.generateEmployees(40);

        Map<String, List<Employee>> mapa1=employeeList.stream()
                .filter(employee -> employee.getCity().equals("Bitola") && employee.getSalary()>800)
                .collect(Collectors.groupingBy(employee -> employee.getWorkingPosition(),Collectors.toList()));

        int brojac=mapa1.size();

        System.out.println(mapa1.entrySet()
                .stream()
                .map(entry->entry.getKey()+" - "+entry.getValue().toString())
                .collect(Collectors.joining("\n","","\n")));
        System.out.println("The number of employees that live in Bitola and have salary greater than 800e is: "+brojac+"\n");
    }
}
