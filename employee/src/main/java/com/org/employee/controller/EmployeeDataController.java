package com.org.employee.controller;

import com.org.employee.model.db.Employee;
import com.org.employee.model.rest.EmployeeData;
import com.org.employee.service.EmployeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeDataController {

    @Autowired
    EmployeeDataService employeeDataService;

    @RequestMapping("/data/insertData")
    @PostMapping
    void insertEmployeeDetails(@RequestBody EmployeeData employeeData){
        employeeDataService.addEmployeeDetails(employeeData);
    }

    @RequestMapping("/data/{id}")
    @PostMapping
    Employee getEmployeeDetails(String id){
        return employeeDataService.getEmployeeDetailsById(id);
    }

    @RequestMapping("/data/deleteData")
    @PostMapping
    void deleteEmployeeData(String id){
        employeeDataService.deleteById(id);
    }
}
