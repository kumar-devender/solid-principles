package com.javafreakers.solidprinciple.serializer;


import com.javafreakers.solidprinciple.entity.Employee;

public class EmployeeFileSerializer {

    public String serialize(Employee employee) {
        StringBuilder sb = new StringBuilder("##### Employee Record ##### ");
        sb.append("Name :" + employee.getName());
        sb.append(System.lineSeparator());
        sb.append("Id :" + employee.getId());
        sb.append(System.lineSeparator());
        sb.append("Department :" + employee.getDepartment());
        sb.append(System.lineSeparator());
        sb.append("Title :" + employee.getTitle());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
