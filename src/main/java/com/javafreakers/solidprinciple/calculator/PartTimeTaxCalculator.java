package com.javafreakers.solidprinciple.calculator;


import com.javafreakers.solidprinciple.entity.Employee;

public class PartTimeTaxCalculator implements TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 16;
    public static final int RETIREMENT_TAX_PERCENTAGE = 5;

    @Override
    public double calculate(Employee employee) {
        return
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                        (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100;
    }
}
