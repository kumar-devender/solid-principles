package com.javafreakers.violatesolidprinciple.entity;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.entity.ServiceLicenceAgreement;

public class Subcontractor extends Employee {
    public static final int MIN_UP_TIME_IN_PERCENTAGE = 98;
    public static final int PROBLEM_SOLUTION_TIME_IN_DAYS = 2;

    /**
     * Violating LSP
     * Subcontractor can not be substitutable for employee.
     * Also Tax calculation is not being done for Subcontractor.
     * Now client that uses employee can send tax calculation request and code will break.
     */
    @Override
    public boolean requestTimeOff(int days) {
        throw new RuntimeException("Illegal state");
    }

    public boolean approveSLA(ServiceLicenceAgreement sla) {
        boolean result = false;
        if (sla.getMinUptimePercentage() > MIN_UP_TIME_IN_PERCENTAGE && sla.getProblemResolutionTimeInDays() <= PROBLEM_SOLUTION_TIME_IN_DAYS) {
            result = true;
        }
        System.out.println(String.format("SLA Approval for %s : %s", this.getName(), result));
        return result;
    }
}
