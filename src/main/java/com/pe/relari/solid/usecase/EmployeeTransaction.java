package com.pe.relari.solid.usecase;
import com.pe.relari.model.Employee;
import com.pe.relari.generic.action.GenericDelete;
import com.pe.relari.generic.action.GenericFind;

public interface EmployeeTransaction
        extends GenericFind<Employee, Integer>, GenericDelete<Integer> {
}
