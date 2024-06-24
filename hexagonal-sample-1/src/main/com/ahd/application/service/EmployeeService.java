package com.ahd.application.service;

import com.ahd.application.dto.EmployeeDTO;
import com.ahd.application.ports.driven.EmployeeDrivenPort;
import com.ahd.application.usecase.EmployeeOperationUseCase;
import com.ahd.domain.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeOperationUseCase {

    private final EmployeeDrivenPort employeeDrivenPort;

    public EmployeeService(EmployeeDrivenPort employeeDrivenPort) {
        this.employeeDrivenPort = employeeDrivenPort;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDrivenPort.getAllEmployees();
    }

    @Override
    public Optional<Employee> FindEmployeeById(Long employeeId) {
        return employeeDrivenPort.FindEmployeeById(employeeId);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDrivenPort.saveEmployee(employee);
    }


    @Override
    public Optional<Employee> updateEmployee(Employee employee) {
        return employeeDrivenPort.updateEmployee(employee);
    }

    @Override
    public void deleteById(Long employeeId) {
        employeeDrivenPort.deleteById(employeeId);
    }
}