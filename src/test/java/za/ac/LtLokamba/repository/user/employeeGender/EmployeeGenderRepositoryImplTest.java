package za.ac.LtLokamba.repository.user.employeeGender;

import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.user.EmployeeGender;
import za.ac.LtLokamba.factory.user.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest
{
    EmployeeGenderRepositoryImpl repository;
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception
    {
        repository = EmployeeGenderRepositoryImpl.getRepository();
        employeeGender = EmployeeGenderFactory.getEmpGender("214291324","001");
    }


    @Test
    public void getAll()
    {

    }

    @Test
    public void create()
    {
        assertNotNull(repository.create(employeeGender));
    }

    @Test
    public void read()
    {
        assertNull(repository.read(employeeGender.getEmployeeId()));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(employeeGender),repository.update(employeeGender));
    }

    @Test
    public void delete()
    {
        repository.delete(employeeGender.getEmployeeId());
    }
}