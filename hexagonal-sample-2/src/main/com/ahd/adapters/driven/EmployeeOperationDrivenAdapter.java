package com.ahd.adapters.driven;

import com.ahd.adapters.driven.repository.EmployeeRepository;
import com.ahd.application.ports.driven.EmployeeDrivenPort;
import com.ahd.domain.entities.Employee;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeOperationDrivenAdapter implements EmployeeDrivenPort {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Optional<Employee> FindEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
