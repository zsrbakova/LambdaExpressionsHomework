package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class FourthBonusQuestion {

    public static void main(String []args) {

        List<Employee> employeeList = GenerateEmployees.generateEmployees(20);
        employeeList.forEach(System.out::println);

        Employee e=employeeList.stream()
                .filter(employee -> employee.getCity().equals("Skopje"))
                .max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
        System.out.println("The employee who lives in Skopje and has the larger salary is: ");
        System.out.println(e.toString());
    }
}
