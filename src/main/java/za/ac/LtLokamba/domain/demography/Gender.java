package za.ac.LtLokamba.domain.demography;

public class Gender
{
    private String male,female;

    private Gender(){}


    public Gender(Builder builder)
    {
        this.male = builder.male;
        this.female = builder.female;
    }

    public String getMale()
    {
        return male;
    }

    public String getFemale()
    {
        return female;
    }

    public static class Builder
    {
        private String male,female;

        public Builder male(String male)
        {
            this.male = male;
            return this;
        }

        public Builder female(String female)
        {
            this.female = female;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "Gender{" + "male='" + male + '\'' + ", female='" + female + '\'' + '}';
    }
}
