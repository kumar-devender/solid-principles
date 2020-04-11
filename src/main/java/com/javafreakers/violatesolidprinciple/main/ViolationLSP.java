package com.javafreakers.violatesolidprinciple.main;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.violatesolidprinciple.entity.Subcontractor;
import com.javafreakers.violatesolidprinciple.calculator.TaxCalculator;

public class ViolationLSP {
    /**
     * Subcontractor violating LSP. Client is able to call calculate.
     * IllegalArgumentException: Unsupported employee type
     */
    public static void main(String[] args) {
        Employee subcontractor = new Subcontractor();
        TaxCalculator.calculate(subcontractor);
    }
}
