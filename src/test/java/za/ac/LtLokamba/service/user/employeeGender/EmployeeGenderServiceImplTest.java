package za.ac.LtLokamba.service.user.employeeGender;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.EmployeeGender;
import za.ac.LtLokamba.factory.user.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest
{
    private EmployeeGenderServiceImpl service;
    private EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception
    {
        service = EmployeeGenderServiceImpl.getService();
        employeeGender = EmployeeGenderFactory.getEmpGender("214291324","0001");
    }


    @Test
    public void getAll()
    {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test
    public void create()
    {
        assertEquals(service.create(employeeGender),service.create(employeeGender));

    }

    @Test
    public void read()
    {
        assertNull(service.read(""));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(service.update(employeeGender),service.update(employeeGender));
    }

    @Test
    public void delete()
    {
       service.delete(employeeGender.getEmployeeId());
       service.delete(employeeGender.getGenderId());
    }
}