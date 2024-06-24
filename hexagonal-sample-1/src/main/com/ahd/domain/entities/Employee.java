package com.ahd.domain.entities;

import java.time.LocalDate;

public record Employee(
        Long employeeId,
        String firstName,
        String lastName,
        LocalDate hireDate
) {
}
