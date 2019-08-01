package za.ac.LtLokamba.domain.demography;

public class Race
{
    private String black,white,indians,chinese;


    private Race(){}

    public Race(Builder builder)
    {
        this.black = builder.black;
        this.white = builder.white;
        this.chinese = builder.chinese;
        this.indians = builder.indians;
    }

    public String getBlack()
    {
        return black;
    }

    public String getWhite()
    {
        return white;
    }

    public String getIndians()
    {
        return indians;
    }

    public String getChinese()
    {
        return chinese;
    }

    public static class Builder
    {
        private String black,white,indians,chinese;

        public Builder black(String black)
        {
            this.black = black;
            return this;
        }

        public Builder white(String white)
        {
            this.white = white;
            return this;
        }

        public Builder indians(String indians)
        {
            this.indians = indians;
            return this;
        }

        public Builder chinese(String chinese)
        {
            this.chinese = chinese;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }

    }

    @Override
    public String toString() {
        return "Race{" + "black='" + black + '\'' + ", white='" + white + '\'' + ", indians='" + indians + '\'' + ", chinese='" + chinese + '\'' + '}';
    }
}
