package com.javafreakers.violatesolidprinciple.repository;

import com.javafreakers.solidprinciple.entity.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeRepository {
    public static final Random RANDOM = new Random();
    public static final int VACATION_DAYS = 24;

    public List<Employee> findAll() {
        return Arrays.asList(
                buildEmployee("devender", "SSD", "IT"),
                buildEmployee("sachin", "SSD", "IT"),
                buildEmployee("SAM", "SSD", "IT"),
                buildEmployee("Chirag", "SSD", "IT")
        );
    }

    private Employee buildEmployee(String name, String title, String department) {
        return Employee.builder()
                .id(RANDOM.nextInt(100))
                .name(name)
                .title(title)
                .totalLeaveBalance(VACATION_DAYS)
                .department(department)
                .build();
    }

    /**
     * This is  clearly violating SRP. Doing multiple thing, serialization, saving file, logging exception handling
     *
     * @param employee
     */
    public void save(Employee employee) {
        StringBuilder sb = new StringBuilder("##### Employee Record ##### ");
        sb.append("Name :" + employee.getName());
        sb.append(System.lineSeparator());
        sb.append("Id :" + employee.getId());
        sb.append(System.lineSeparator());
        sb.append("Department :" + employee.getDepartment());
        sb.append(System.lineSeparator());
        sb.append("Title :" + employee.getTitle());
        sb.append(System.lineSeparator());
        Path path = Paths.get(String.format(employee.getName(), employee.getId()));
        try {
            Files.write(path, sb.toString().getBytes());
            System.out.println("Employee saved successfully");
        } catch (IOException e) {
            System.out.println("Exception in saving employee");
        }
    }

}
