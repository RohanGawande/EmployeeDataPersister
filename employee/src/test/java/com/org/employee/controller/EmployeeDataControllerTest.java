package com.org.employee.controller;

import com.org.employee.model.db.Employee;
import com.org.employee.model.rest.EmployeeData;
import com.org.employee.service.EmployeeDataService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/*@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
@RunWith(MockitoJUnitRunner.class)*/
public class EmployeeDataControllerTest {
    @InjectMocks
    EmployeeDataController employeeDataController;

    @Mock
    EmployeeDataService employeeDataService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInsertData() {
        employeeDataController.insertEmployeeDetails(new EmployeeData("1234", "Adam", "home"));
    }

    @Test
    public void testRetrieveData() {
        when(employeeDataService.getEmployeeDetailsById(any())).thenReturn(new Employee("1234", "Adam", "home"));
        Assert.assertEquals(employeeDataController.getEmployeeDetails("1234"), new Employee("1234", "Adam", "home"));
    }

    @Test
    public void testDeleteData() {
        employeeDataController.deleteEmployeeData("1234");
    }
}
