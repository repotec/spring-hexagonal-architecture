package com.ahd.adapters.driven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    private Long employeeId;
}
