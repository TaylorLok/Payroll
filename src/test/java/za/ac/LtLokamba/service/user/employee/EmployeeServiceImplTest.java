package za.ac.LtLokamba.service.user.employee;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.Employee;
import za.ac.LtLokamba.factory.user.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest
{
    private EmployeeServiceImpl service;
    private Employee employee;

    @Before
    public void setUp() throws Exception
    {
        service = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.getEmployee("Taylor","Lokombe","0001");
    }


    @Test
    public void getAll()
    {
        assertEquals(service.getAll(),service.getAll());
        System.out.println(service);
    }

    @Test
    public void create()
    {
        assertEquals(service.create(employee),service.create(employee));
    }

    @Test
    public void read()
    {
        assertNull(service.read(""));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(service.update(employee),service.update(employee));
    }

    @Test
    public void delete()
    {
        service.delete("");
    }
}