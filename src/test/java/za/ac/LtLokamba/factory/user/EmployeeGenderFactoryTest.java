package za.ac.LtLokamba.factory.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.Employee;
import za.ac.LtLokamba.domain.user.EmployeeGender;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest
{
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception
    {
        employeeGender = EmployeeGenderFactory.getEmpGender("555555","003");
    }

    @Test
    public void createEmployeeGender()
    {
        assertNotNull(employeeGender.getEmployeeId(),employeeGender.getEmployeeId());
    }
}