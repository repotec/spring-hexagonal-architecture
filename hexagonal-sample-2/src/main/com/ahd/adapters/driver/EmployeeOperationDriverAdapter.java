package com.ahd.adapters.driver;

import com.ahd.adapters.mapper.EmployeeMapper;
import com.ahd.application.dto.EmployeeDTO;
import com.ahd.application.ports.driver.EmployeeDriverPort;
import com.ahd.application.usecase.EmployeeOperationUseCase;
import com.ahd.domain.entities.Employee;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class EmployeeOperationDriverAdapter implements EmployeeDriverPort {

    private final EmployeeOperationUseCase employeeOperationUseCase;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeOperationUseCase.getAllEmployees()
                                       .stream()
                                       .map(employeeMapper::entityToDto)
                                       .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO findEmployeeById(Long employeeId) {
        return employeeMapper.entityToDto(employeeOperationUseCase.findEmployeeById(employeeId));
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeOperationUseCase.saveEmployee(employeeMapper.dtoToEntity(employeeDTO));
        return employeeMapper.entityToDto(employee);
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeOperationUseCase.saveEmployee(employeeMapper.dtoToEntity(employeeDTO));
        return employeeMapper.entityToDto(employee);
    }

    @Override
    public void deleteById(Long employeeId) {
        employeeOperationUseCase.deleteById(employeeId);
    }
}
