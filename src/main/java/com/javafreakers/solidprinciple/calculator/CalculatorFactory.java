package com.javafreakers.solidprinciple.calculator;


import com.javafreakers.solidprinciple.entity.EmployeeType;

import java.util.HashMap;
import java.util.Map;

import static com.javafreakers.solidprinciple.entity.EmployeeType.FULL_TIME;
import static com.javafreakers.solidprinciple.entity.EmployeeType.INTERN;
import static com.javafreakers.solidprinciple.entity.EmployeeType.PART_TIME;

public class CalculatorFactory {
    private static final Map<EmployeeType, TaxCalculator> EMPLOYEE_TYPE_TAX_CALCULATOR_MAP = new HashMap<>();

    /**
     *As the calculators are not holding any state so it is safe to be share these instance in application.
     * If calculator hold any kind of state then create request based instance.
     */
    static {
        EMPLOYEE_TYPE_TAX_CALCULATOR_MAP.put(INTERN, new InternTaxCalculator());
        EMPLOYEE_TYPE_TAX_CALCULATOR_MAP.put(FULL_TIME, new FullTimeTaxCalculator());
        EMPLOYEE_TYPE_TAX_CALCULATOR_MAP.put(PART_TIME, new PartTimeTaxCalculator());
    }

    public static TaxCalculator getTaxCalculator(EmployeeType type) {
        if (!EMPLOYEE_TYPE_TAX_CALCULATOR_MAP.containsKey(type)) {
            throw new IllegalArgumentException(String.format("%s type not supported", type.name()));
        }
        return EMPLOYEE_TYPE_TAX_CALCULATOR_MAP.get(type);
    }
}
