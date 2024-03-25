package com.pe.relari.solid.usecase.first;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.generic.action.GenericCreate;
import com.pe.relari.generic.action.GenericFind;

import java.util.List;

public class EmployeeFirstSolid
        implements GenericCreate<Employee>, GenericFind<Employee, Integer> {

    private static final List<Employee> employees = EmployeeRepository.employees();

    @Override
    public void save(Employee value) {
        employees.add(value);
    }

    @Override
    public Employee findById(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado."));
    }

}
