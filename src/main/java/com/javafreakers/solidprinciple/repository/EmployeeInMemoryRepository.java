package com.javafreakers.solidprinciple.repository;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class EmployeeInMemoryRepository implements EmployeeRepository {
    public static final Random RANDOM = new Random();
    public static final int VACATION_DAYS = 24;
    private final EmployeeFileSerializer employeeFileSerializer;

    @Override
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

    @Override
    public void save(Employee emp) throws IOException {
        String serializedEmp = employeeFileSerializer.serialize(emp);
        Path path = Paths.get(String.format(emp.getName(), emp.getId()));
        Files.write(path, serializedEmp.getBytes());
    }
}
