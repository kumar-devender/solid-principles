package com.javafreakers.solidprinciple.main;

import com.javafreakers.solidprinciple.entity.ServiceLicenceAgreement;
import com.javafreakers.solidprinciple.entity.SubContractor;

import java.util.Arrays;
import java.util.List;

/**
 * LSP
 */
public class ApproveSLA {
    public static final int PROBLEM_RESOLUTION_TIME_IN_DAYS = 2;
    public static final int UPTIME_PERCENTAGE = 98;

    public static void main(String[] args) {
        ServiceLicenceAgreement sla = new ServiceLicenceAgreement();
        sla.setMinUptimePercentage(UPTIME_PERCENTAGE);
        sla.setProblemResolutionTimeInDays(PROBLEM_RESOLUTION_TIME_IN_DAYS);
        List<SubContractor> contractors = Arrays.asList(new SubContractor(
                "Devender", "IT", "SSD", 2000
        ), new SubContractor(
                "Jakson", "IT", "SSD", 2000

        ));
        contractors.forEach(contractor -> contractor.approveSLA(sla));
    }
}
