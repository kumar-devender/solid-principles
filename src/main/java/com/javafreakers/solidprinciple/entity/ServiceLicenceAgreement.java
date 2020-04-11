package com.javafreakers.solidprinciple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ServiceLicenceAgreement {
    private int minUptimePercentage;
    private int problemResolutionTimeInDays;
}
