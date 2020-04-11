package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.logging.ConsoleLogger;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import com.javafreakers.solidprinciple.repository.EmployeeInMemoryRepository;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;

import java.io.IOException;
import java.util.List;

/**
 * SRP
 */
public class SaveEmployee {

    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository empRepository = new EmployeeInMemoryRepository(employeeFileSerializer);
        List<Employee> employeeList = empRepository.findAll();

        employeeList.forEach(employee -> {
            try {
                empRepository.save(employee);
                consoleLogger.logInfo(String.format("Saved employee %s", employee.getName()));
            } catch (IOException e) {
                consoleLogger.logError("Can not save employee", e);
            }
        });
    }
}
