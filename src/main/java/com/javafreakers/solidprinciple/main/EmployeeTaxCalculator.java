package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.calculator.CalculatorFactory;
import com.javafreakers.solidprinciple.calculator.TaxCalculator;
import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.logging.ConsoleLogger;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import com.javafreakers.solidprinciple.repository.EmployeeInMemoryRepository;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;

import java.util.List;

/**
 * OCP, LSP, SRP
 */
public class EmployeeTaxCalculator {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository empRepository = new EmployeeInMemoryRepository(employeeFileSerializer);
        List<Employee> employeeList = empRepository.findAll();

        employeeList.forEach(employee -> {
            TaxCalculator taxCalculator = CalculatorFactory.getTaxCalculator(employee.getType());
            consoleLogger.logInfo(String.format("Tax for employee %s is %s", employee.getName(), taxCalculator.calculate(employee)));
        });
    }
}
