package za.ac.LtLokamba.repository.demography.gender;

import za.ac.LtLokamba.domain.demography.Gender;

import java.util.*;

public class GenderRepositoryImpl implements GenderRepository
{
    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genderMap;


    private GenderRepositoryImpl()
    {
        this.genderMap = new HashMap<>();

    }

    public static GenderRepositoryImpl getRepository() {
        if (repository == null)repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAll()
    {
        Collection<Gender> genderCollection = this.genderMap.values();
        Set<Gender> genderSet = new HashSet<>();
        genderSet.addAll(genderCollection);
        return genderSet;
    }

    @Override
    public Gender create(Gender gender)
    {
        this.genderMap.put(gender.getGenderId(),gender);
        this.genderMap.put(gender.getTypeGender(),gender);
        return gender;
    }

    @Override
    public Gender read(String s)
    {
        return this.genderMap.get(s);
    }

    @Override
    public Gender update(Gender gender)
    {
        this.genderMap.replace(gender.getTypeGender(),gender);
        this.genderMap.replace(gender.getGenderId(),gender);
        return gender;
    }

    @Override
    public void delete(String s)
    {
      this.genderMap.remove(s);
    }
}
