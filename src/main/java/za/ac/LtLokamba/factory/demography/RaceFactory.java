package za.ac.LtLokamba.factory.demography;

import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.util.Misc;

public class RaceFactory
{
    public static Race getRace(String race)
    {
        return new Race.Builder()
               .raceId(Misc.generateId())
                .race(race)
                .build();
    }
}
