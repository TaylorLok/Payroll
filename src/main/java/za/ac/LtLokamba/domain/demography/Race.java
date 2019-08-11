package za.ac.LtLokamba.domain.demography;

public class Race
{
    private String raceId,race;

    private Race(){}

    public Race(Builder builder)
    {
        this.race = builder.race;
    }

    public String getRaceId()
    {
        return raceId;
    }

    public String getRace()
    {
        return race;
    }

    public static class Builder
    {
        private String raceId,race;

        public Builder raceId(String race)
        {
            this.raceId = race;
            return this;
        }
        public Builder race(String race)
        {
            this.race = race;
            return this;
        }
        public Race build()
        {
            return new Race(this);
        }
    }

}
