package za.ac.LtLokamba.service.demography.race;

import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.repository.demography.race.RaceRepositoryImpl;

import java.util.Set;

public class RaceServiceImpl implements RaceService
{
    private static RaceServiceImpl service = null;
    private RaceRepositoryImpl repository;

    private RaceServiceImpl()
    {
        this.repository = RaceRepositoryImpl.getRepository();
    }

    public static RaceServiceImpl getService()
    {
        if (service == null)service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Set<Race> getAll()
    {
        return repository.getAll();
    }

    @Override
    public Race create(Race race)
    {
        return repository.create(race);
    }

    @Override
    public Race read(String s) {
        return repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }
}
