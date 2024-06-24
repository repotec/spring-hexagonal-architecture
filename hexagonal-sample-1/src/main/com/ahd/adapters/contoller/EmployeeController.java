package com.ahd.adapters.contoller;

import com.ahd.adapters.driver.EmployeeOperationDriverAdapter;
import com.ahd.application.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeOperationDriverAdapter employeeOperationDriverAdapter;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<EmployeeDTO> getAllEmployees() {
        return employeeOperationDriverAdapter.getAllEmployees();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO findEmployeeById(@PathVariable Long employeeId) {
        return employeeOperationDriverAdapter.findEmployeeById(employeeId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeOperationDriverAdapter.saveEmployee(employeeDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO updateEmployee(@RequestBody  EmployeeDTO employeeDTO) {
        return employeeOperationDriverAdapter.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long employeeId) {
        employeeOperationDriverAdapter.deleteById(employeeId);
    }

}
