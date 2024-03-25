package com.pe.relari.solid.usecase.second;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.solid.usecase.EmployeeTransaction;

import java.util.List;

public class EmployeeSecondSolid implements EmployeeTransaction {

    private static final List<Employee> employees = EmployeeRepository.employees();

    @Override
    public Employee findById(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found."));
    }

    @Override
    public void deleteById(Integer id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

}
