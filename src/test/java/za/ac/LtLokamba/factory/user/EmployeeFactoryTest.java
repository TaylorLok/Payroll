package za.ac.LtLokamba.factory.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest
{

    Employee employee;

    @Before
    public void setUp() throws Exception
    {
        employee = EmployeeFactory.getEmployee("sizwe","sipho","003");
    }

    @Test
    public void createEmployee()
    {
        assertEquals(employee.getFirstName(),"sizwe");
    }
}