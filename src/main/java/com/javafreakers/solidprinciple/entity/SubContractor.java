package com.javafreakers.solidprinciple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubContractor {
    public static final int MIN_UP_TIME_IN_PERCENTAGE = 98;
    public static final int PROBLEM_SOLUTION_TIME_IN_DAYS = 2;
    private String name;
    private String department;
    private String title;
    private int monthlyIncome;

    public boolean approveSLA(ServiceLicenceAgreement sla) {
        boolean result = false;
        if (sla.getMinUptimePercentage() > MIN_UP_TIME_IN_PERCENTAGE && sla.getProblemResolutionTimeInDays() <= PROBLEM_SOLUTION_TIME_IN_DAYS) {
            result = true;
        }
        System.out.println(String.format("SLA Approval for %s : %s", name, result));
        return result;
    }
}
