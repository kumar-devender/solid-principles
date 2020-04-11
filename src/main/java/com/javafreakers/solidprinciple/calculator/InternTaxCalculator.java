package com.javafreakers.solidprinciple.calculator;


import com.javafreakers.solidprinciple.entity.Employee;

public class InternTaxCalculator implements TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 16;

    @Override
    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() > 350) {
            return employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE / 100;
        }
        return 0;
    }
}
