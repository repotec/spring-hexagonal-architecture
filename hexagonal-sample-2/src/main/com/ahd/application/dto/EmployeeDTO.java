package com.ahd.application.dto;

import java.time.LocalDate;

public record EmployeeDTO(
        Long employeeId,
        String firstName,
        String lastName,
        LocalDate hireDate
) {
}
