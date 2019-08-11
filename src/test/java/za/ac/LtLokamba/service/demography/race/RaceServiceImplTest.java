package za.ac.LtLokamba.service.demography.race;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.factory.demography.RaceFactory;

import static org.junit.Assert.*;

public class RaceServiceImplTest
{
    private RaceServiceImpl service;
    private Race race;

    @Before
    public void setUp() throws Exception
    {
        service = RaceServiceImpl.getService();
        race = RaceFactory.getRace("BLack");
    }


    @Test
    public void getAll()
    {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test(expected = NullPointerException.class)
    public void create()
    {
        assertEquals(service.create(race),service.create(race));
    }

    @Test
    public void read()
    {
        assertNull(service.read(""));
    }

    @Test(expected = NullPointerException.class)
    public void update()
    {
        assertEquals(service.update(race),service.update(race));
    }

    @Test
    public void delete()
    {
        service.delete("");
    }
}