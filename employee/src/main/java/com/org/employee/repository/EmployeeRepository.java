package com.org.employee.repository;

import com.org.employee.model.db.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, String> {

}
