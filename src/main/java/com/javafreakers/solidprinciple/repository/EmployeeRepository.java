package com.javafreakers.solidprinciple.repository;

import com.javafreakers.solidprinciple.entity.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();

    void save(Employee emp) throws IOException;
}
