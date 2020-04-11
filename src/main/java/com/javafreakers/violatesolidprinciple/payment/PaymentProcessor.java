package com.javafreakers.violatesolidprinciple.payment;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.violatesolidprinciple.repository.EmployeeRepository;

public class PaymentProcessor {
    private EmployeeRepository employeeRepository;

    /**
     * Violating DIP
     * PaymentProcessor is depending on concrete implementation instead of abstraction
     * What if we want to use different data store instead of in memory
     */
    public PaymentProcessor() {
        this.employeeRepository = new EmployeeRepository();
    }

    /**
     * static method also violation of DIP.
     * What if we want to use different type notification instead of email
     */
    public int sendPayment() {
        return employeeRepository.findAll()
                .stream()
                .peek(employee -> {
                    System.out.println(String.format("Paying %s", employee.getMonthlyIncome()));
                    EmailNotification.sendNotification(employee);
                })
                .mapToInt(Employee::getMonthlyIncome)
                .sum();
    }
}
