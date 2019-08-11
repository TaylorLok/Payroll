package za.ac.LtLokamba.repository.user.employee;

import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.Employee;
import za.ac.LtLokamba.factory.user.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest
{
    EmployeeRepositoryImpl repository;
    Employee employee;

    @Before
    public void setUp() throws Exception
    {
        repository = EmployeeRepositoryImpl.getRepository();
        employee = EmployeeFactory.getEmployee("Lokombe","Taylor","2142913245");
    }

    @Test
    public void getAll()
    {
        assertNotNull(repository.create(employee));
    }

    @Test
    public void create()
    {
        assertNull(repository.read(employee.getFirstName()));
    }

    @Test
    public void read()
    {
        repository.read(employee.getEmployeeId());
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(employee),repository.update(employee));
    }

    @Test
    public void delete()
    {
        repository.delete(employee.getFirstName());
    }
}