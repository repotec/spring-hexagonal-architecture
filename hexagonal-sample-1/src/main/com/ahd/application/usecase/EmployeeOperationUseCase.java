package com.ahd.application.usecase;

import com.ahd.domain.entities.Employee;

import java.util.List;

public interface EmployeeOperationUseCase {
    List<Employee> getAllEmployees();

    Employee findEmployeeById(Long employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteById(Long employeeId);
}
