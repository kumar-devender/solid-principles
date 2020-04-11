package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.logging.ConsoleLogger;
import com.javafreakers.solidprinciple.repository.EmployeeInMemoryRepository;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;

import java.util.List;

/**
 * OCP, LSP, SRP
 */
public class NationalHolidayTimeOff {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository empRepository = new EmployeeInMemoryRepository(employeeFileSerializer);
        List<Employee> employeeList = empRepository.findAll();

        employeeList.forEach(employee -> {
            boolean result = employee.requestTimeOff(1);
            consoleLogger.logInfo(String.format("Leave balance deducted for employee %s : %s", employee.getName(), result));
        });
    }
}
