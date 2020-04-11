package com.javafreakers.violatesolidprinciple.main;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.violatesolidprinciple.repository.EmployeeRepository;

import java.util.List;

public class ViolateSRP {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employeeList = employeeRepository.findAll();
        employeeList.forEach(employee -> {
            employeeRepository.save(employee);
        });
    }
}
