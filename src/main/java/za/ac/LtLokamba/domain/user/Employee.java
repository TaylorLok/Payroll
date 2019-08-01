package za.ac.LtLokamba.domain.user;

public class Employee
{
    private String firstName, lastName;

    public Employee(){}//default constructor

    public Employee (Builder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public static class Builder
    {
        private String firstName;
        private String lastName;

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }

       public Employee build()
       {
           return new Employee(this);
       }

    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}
