package com.javafreakers.solidprinciple.document;

import com.javafreakers.solidprinciple.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payslip implements ExportableText {
    private Employee employee;
    private Month month;

    @Override
    public String toTxt() {
        StringBuilder sb = new StringBuilder("##### Pay Slip ##### ");
        sb.append("Month :" + this.month);
        sb.append(System.lineSeparator());
        sb.append("Name :" + employee.getName());
        sb.append(System.lineSeparator());
        sb.append("Salary :" + employee.getMonthlyIncome());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
