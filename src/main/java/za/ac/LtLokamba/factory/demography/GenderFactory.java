package za.ac.LtLokamba.factory.demography;

import za.ac.LtLokamba.domain.demography.Gender;

public class GenderFactory
{
    public static Gender getGender(String gender){
        return new Gender.Builder()
               // .genderId(Misc.generateId())
                .typeGnder(gender)
                .build();
    }
}
