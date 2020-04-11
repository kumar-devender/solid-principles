package com.javafreakers.violatesolidprinciple.calculator;

import com.javafreakers.solidprinciple.entity.Employee;
import com.javafreakers.solidprinciple.entity.EmployeeType;

public class TaxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 16;
    public static final int RETIREMENT_TAX_PERCENTAGE_FULL_TIME_EMPLOYEE = 10;
    public static final int RETIREMENT_TAX_PERCENTAGE_PART_TIME_EMPLOYEE = 5;
    public static final int HEALTH_INSURANCE_AMOUNT = 100;

    /**
     * Violation of OCP.
     * For new employee type we have to make change in existing code which may lead to risk of introducing bugs
     * Also lots of if condition hard to understand and maintain
     */
    public static double calculate(Employee employee) {
        if (employee.getType() == EmployeeType.FULL_TIME) {
            return HEALTH_INSURANCE_AMOUNT + (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100
                    + (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE_FULL_TIME_EMPLOYEE) / 100;
        }

        if (employee.getType() == EmployeeType.PART_TIME) {
            return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100
                    + (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE_PART_TIME_EMPLOYEE) / 100;
        }

        if (employee.getType() == EmployeeType.FULL_TIME) {
            if (employee.getMonthlyIncome() > 350) {
                return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
            }
            return 0;
        }
        throw new IllegalArgumentException("Unsupported employee type");
    }
}
