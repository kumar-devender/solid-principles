package com.javafreakers.solidprinciple.calculator;


import com.javafreakers.solidprinciple.entity.Employee;

public class FullTimeTaxCalculator implements TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 16;
    public static final int RETIREMENT_TAX_PERCENTAGE = 10;
    public static final int HEALTH_INSURANCE_AMOUNT = 100;

    @Override
    public double calculate(Employee employee) {
        return HEALTH_INSURANCE_AMOUNT +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100;
    }
}
