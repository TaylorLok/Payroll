package za.ac.LtLokamba.repository.demography.gender;

import za.ac.LtLokamba.domain.demography.Gender;
import za.ac.LtLokamba.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender,String>
{
    Set<Gender> getAll();
}
