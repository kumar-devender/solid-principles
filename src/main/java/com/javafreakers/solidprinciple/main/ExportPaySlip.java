package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.document.Payslip;
import com.javafreakers.solidprinciple.repository.EmployeeInMemoryRepository;
import com.javafreakers.solidprinciple.repository.EmployeeRepository;
import com.javafreakers.solidprinciple.serializer.EmployeeFileSerializer;

import java.time.Month;

/**
 * ISP
 */

public class ExportPaySlip {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository empRepository = new EmployeeInMemoryRepository(employeeFileSerializer);
        empRepository.findAll().forEach(employee -> {
            System.out.println(new Payslip(employee, Month.APRIL).toTxt());
        });
    }
}
