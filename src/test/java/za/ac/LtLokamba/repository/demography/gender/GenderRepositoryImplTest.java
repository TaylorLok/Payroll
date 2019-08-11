package za.ac.LtLokamba.repository.demography.gender;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Gender;
import za.ac.LtLokamba.factory.demography.GenderFactory;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest
{

    GenderRepositoryImpl repository = null;
    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        repository = GenderRepositoryImpl.getRepository();
        gender = GenderFactory.getGender("Male");
    }

    @Test
    public void create()
    {
        assertNotNull(repository.create(gender));
    }

    @Test
    public void read()
    {
        assertNull(repository.read(gender.getGenderId()));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(gender),repository.update(gender));
    }

    @Test
    public void delete()
    {
        repository.delete(gender.getGenderId());
    }
}