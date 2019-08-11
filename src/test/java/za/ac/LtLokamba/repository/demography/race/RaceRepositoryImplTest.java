package za.ac.LtLokamba.repository.demography.race;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.factory.demography.RaceFactory;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest
{

    private RaceRepositoryImpl repository = null;
    private Race race;

    @Before
    public void setUp() throws Exception
    {
        repository = RaceRepositoryImpl.getRepository();
        race = RaceFactory.getRace("White");
    }

   // @Ignore
    @Test
    public void create()
    {
        assertEquals(repository.create(race),repository.create(race));
    }

    @Test
    public void read()
    {
        assertNull(repository.read(race.getRaceId()));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(race),repository.update(race));
    }

    @Test
    public void delete()
    {
        repository.delete(race.getRaceId());
    }
}