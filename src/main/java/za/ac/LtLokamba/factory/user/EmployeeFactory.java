package za.ac.LtLokamba.factory.user;

import za.ac.LtLokamba.domain.user.Employee;

public class EmployeeFactory
{
    public static Employee getEmployee(String f,String l,String id)
    {
        return new Employee.Builder()
                .employeeId(id)
                .firstName(f)
                .lastName(l)
                .build();
    }
}
