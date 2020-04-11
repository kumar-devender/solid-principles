package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.notification.EmailNotifier;
import com.javafreakers.solidprinciple.payment.PaymentProcessor;
import com.javafreakers.solidprinciple.repository.EmployeeInMemoryRepository;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;

/**
 * DIP
 */
public class PayEmployee {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository empRepository = new EmployeeInMemoryRepository(employeeFileSerializer);
        EmailNotifier emailNotifier = new EmailNotifier();
        PaymentProcessor paymentProcessor = new PaymentProcessor(empRepository, emailNotifier);
        paymentProcessor.sendPayment();
    }
}
