package za.ac.LtLokamba.domain.demography;

import java.util.Objects;

public class Gender
{
    private String genderId,typeGender;

    private Gender(){}

    public Gender(Builder builder)
    {
        this.typeGender = builder.typeGender;
    }

    public String getGenderId()
    {
        return genderId;
    }

    public String getTypeGender()
    {
        return typeGender;
    }

    public static class Builder
    {
        private String genderId,typeGender;
        public Builder genderId(String id)
        {
            this.genderId = id;
            return this;
        }
        public Builder typeGnder(String typeGender)
        {
            this.typeGender = typeGender;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }
    }

    @Override
    public String toString()
    {
        return "Gender{" + "genderId='" + genderId + '\'' + ", typeGender='" + typeGender + '\'' + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Gender)) return false;
        Gender gender = (Gender) o;
        return genderId.equals(gender.genderId) && typeGender.equals(gender.typeGender);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(genderId, typeGender);
    }
}
