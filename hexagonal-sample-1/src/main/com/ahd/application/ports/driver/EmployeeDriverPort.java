package com.ahd.application.ports.driver;

import com.ahd.application.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeDriverPort {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO  findEmployeeById(Long employeeId);

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

    void deleteById(Long employeeId);
}
