package com.org.employee;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import org.cassandraunit.CassandraCQLUnit;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Test
	void contextLoads() {
	}

}
