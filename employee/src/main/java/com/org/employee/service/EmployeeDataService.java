package com.org.employee.service;

import com.org.employee.model.db.Employee;
import com.org.employee.model.rest.EmployeeData;
import com.org.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class EmployeeDataService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeDetailsById(String id){
        log.info("Fetching employee details from db with id : {}", id);
        Optional<Employee> employee =  employeeRepository.findById(id);
        return employee.orElse(null);
    }

    public void addEmployeeDetails(EmployeeData employeeData){
        if(employeeRepository.existsById(employeeData.getId())){
            log.info("Updating employee details in db with id : {}", employeeData.getId());
            //employeeRepository.deleteById(employeeData.getId());
            employeeRepository.save(employeeData.getEmployee(employeeData));
        }
        else{
            log.info("Adding employee details in db with id : {}", employeeData.getId());
            employeeRepository.save(employeeData.getEmployee(employeeData));
        }
    }

    public void deleteById(String id){
        employeeRepository.deleteById(id);
    }

}
