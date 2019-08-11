package za.ac.LtLokamba.repository.demography.race;

import za.ac.LtLokamba.domain.demography.Race;
import za.ac.LtLokamba.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository <Race,String>
{
    Set<Race> getAll();
}
