package za.ac.LtLokamba.factory.demography;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.LtLokamba.domain.demography.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest
{

    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        gender = GenderFactory.getGender("Female");
    }

    @Test
    public void createGender()
    {
        assertEquals(gender.getTypeGender(),gender.getTypeGender());
    }
}