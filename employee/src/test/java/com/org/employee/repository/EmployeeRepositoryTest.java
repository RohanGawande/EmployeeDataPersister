package com.org.employee.repository;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import org.cassandraunit.CassandraCQLUnit;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class EmployeeRepositoryTest {
    @Rule
    public CassandraCQLUnit cassandraCQLUnit =
            new CassandraCQLUnit(new ClassPathCQLDataSet("employee.cql","employee"));

    @Test
    public void should_have_started_and_execute_cql_script() throws Exception {
        ResultSet result = cassandraCQLUnit.session.execute("select * from employee WHERE id='1234'");
        Assert.assertEquals(result.iterator().next().getString("name"), "Adam");
    }

}
