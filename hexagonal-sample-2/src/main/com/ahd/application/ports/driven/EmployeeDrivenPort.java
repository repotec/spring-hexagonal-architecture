package com.ahd.application.ports.driven;

import com.ahd.domain.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDrivenPort {

    List<Employee> getAllEmployees();

    Optional<Employee>  FindEmployeeById(Long employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteById(Long employeeId);
}
