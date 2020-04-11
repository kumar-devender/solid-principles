package com.javafreakers.solidprinciple.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private int id;
    private String name;
    private String department;
    private String title;
    private int monthlyIncome;
    private EmployeeType type;
    private int totalLeaveBalance;

    public boolean requestTimeOff(int days) {
        if (totalLeaveBalance < days) {
            return false;
        }
        totalLeaveBalance = totalLeaveBalance - days;
        return true;
    }
}
