package com.javafreakers.violatesolidprinciple.payment;

import com.javafreakers.solidprinciple.entity.Employee;

public class EmailNotification {
    public static void sendNotification(Employee employee) {
        System.out.println(String.format("Sending email notification to %s", employee.getName()));
    }
}
