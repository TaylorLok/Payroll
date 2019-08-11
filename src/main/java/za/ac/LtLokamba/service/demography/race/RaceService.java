package za.ac.LtLokamba.service.demography.race;

import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.service.IService;

import java.util.Set;

public interface RaceService extends IService <Race,String>
{
    Set<Race> getAll();
}
