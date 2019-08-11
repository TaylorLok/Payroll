package za.ac.LtLokamba.repository.demography.race;

import za.ac.LtLokamba.domain.demography.Race;

import java.util.*;

public class RaceRepositoryImpl implements RaceRepository
{

    private static RaceRepositoryImpl repository = null;
    private List<Race> raceList;
    private RaceRepositoryImpl(){
        this.raceList = new ArrayList<>();
    }

    public static RaceRepositoryImpl getRepository()
    {
        if (repository == null)repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Race> getAll()
    {
        Collection<Race> races = this.raceList;
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }

    @Override
    public Race create(Race race)
    {
        if (read(race.getRaceId()) == null)
        {
            this.raceList.add(race);
        }
        return read(race.getRaceId());
    }

    @Override
    public Race read(String s) {
        return this.raceList.stream()
                .filter(race -> s.equalsIgnoreCase(race.getRaceId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Race update(Race rce)
    {
        if(read(rce.getRaceId()) != null)
        {
            delete(rce.getRaceId());
            create(rce);
        }
        return read(rce.getRaceId());
    }

    @Override
    public void delete(String s)
    {
        Race race = read(s);
        this.raceList.remove(race);
    }
}
