package com.javafreakers.solidprinciple.payment;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.notification.Notifier;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentProcessor {
    private final EmployeeRepository employeeRepository;
    private final Notifier notifier;

    public int sendPayment() {
        return employeeRepository.findAll()
                .stream()
                .peek(employee -> {
                    notifier.sendNotification(employee);
                })
                .mapToInt(Employee::getMonthlyIncome)
                .sum();

    }
}
