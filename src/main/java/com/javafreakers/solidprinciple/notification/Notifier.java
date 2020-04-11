package com.javafreakers.solidprinciple.notification;

import com.javafreakers.solidprinciple.entity.Employee;

public interface Notifier {
    void sendNotification(Employee employee);
}
