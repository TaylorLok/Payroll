package za.ac.LtLokamba.service.demography.gender;

import za.ac.LtLokamba.domain.demography.Gender;
import za.ac.LtLokamba.service.IService;

import java.util.Set;

public interface GenderService extends IService <Gender,String>
{
    Set<Gender> getAll();
}
