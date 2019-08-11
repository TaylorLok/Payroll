package za.ac.LtLokamba.domain.user;

import java.util.Objects;

public class Employee
{
    private String firstName, lastName,employeeId;

    public Employee(){}//default constructor

    public Employee (Builder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeId = builder.employeeId;
    }

    public String getEmployeeId()
    {
        return employeeId;
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
        private String employeeId;

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
        public Builder employeeId(String employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.employeeId = employee.employeeId;
            return this;
        }

       public Employee build()
       {
           return new Employee(this);
       }

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName)
                && employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, employeeId);
    }
}
