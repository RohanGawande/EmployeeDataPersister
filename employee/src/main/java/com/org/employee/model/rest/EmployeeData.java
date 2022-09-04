package com.org.employee.model.rest;

import com.org.employee.model.db.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeData {

    private String id;
    private String name;
    private String address;

    public Employee getEmployee(EmployeeData employeeData){
        Employee employee = new Employee();
        employee.setId(employee.getId());
        employee.setName(employee.getName());
        employee.setAddress(employee.getAddress());

        return employee;
    }
}
