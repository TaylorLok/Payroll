package za.ac.LtLokamba.factory.demography;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest
{

    Race race;

    @Before
    public void setUp() throws Exception
    {
        race = RaceFactory.getRace("Mulungu");
    }

    @Test
    public void createRace()
    {
        assertEquals(race.getRace(),"Mulungu");
    }
}