package com.ahd.adapters.mapper;

import com.ahd.application.dto.EmployeeDTO;
import com.ahd.domain.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * map from domain entity to dto and vice versa
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(target = "employeeId", source = "employeeId")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "hireDate", source = "hireDate")
    EmployeeDTO entityToDto(Employee employee);

    @Mapping(target = "employeeId", source = "employeeId")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "hireDate", source = "hireDate")
    Employee dtoToEntity(EmployeeDTO employeeDTO);
}