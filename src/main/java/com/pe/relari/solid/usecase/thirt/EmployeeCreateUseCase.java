package com.pe.relari.solid.usecase.thirt;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.generic.action.GenericCreate;

import java.util.List;

public class EmployeeCreateUseCase implements GenericCreate<Employee> {

    private static final List<Employee> employees = EmployeeRepository.employees();

    @Override
    public void save(Employee value) {
        employees.add(value);
    }

}
