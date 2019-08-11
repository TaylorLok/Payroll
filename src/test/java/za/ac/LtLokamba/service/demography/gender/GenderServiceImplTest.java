package za.ac.LtLokamba.service.demography.gender;

import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Gender;
import za.ac.LtLokamba.factory.demography.GenderFactory;
import za.ac.LtLokamba.util.Misc;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GenderServiceImplTest
{
    private GenderServiceImpl service;
    private Gender gender;
    private Map<String, Gender> genderStringMap;

    @Before
    public void setUp() throws Exception
    {
        this.service = GenderServiceImpl.getService();
        genderStringMap = new HashMap<>();
        gender = GenderFactory.getGender("other");
        genderStringMap.put(Misc.generateId(),GenderFactory.getGender("Male"));
        genderStringMap.put(Misc.generateId(),GenderFactory.getGender("Female"));
        genderStringMap.put(Misc.generateId(), GenderFactory.getGender("Male"));
    }

    @Test
    public void getAll()
    {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test
    public void create()
    {
        assertEquals(service.create(gender),service.create(gender));
    }

    @Test
    public void read()
    {
        assertNull(service.read(""));
    }

    @Test
    public void update()
    {
        assertEquals(service.update(gender),service.update(gender));
    }

    @Test
    public void delete()
    {
        service.delete("gender");
    }
}