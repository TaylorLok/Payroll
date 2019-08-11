package za.ac.LtLokamba.factory.user;

import za.ac.LtLokamba.domain.user.EmployeeGender;

public class EmployeeGenderFactory
{
    public static EmployeeGender getEmpGender(String empId,String genderId)
    {
        return new EmployeeGender.Builder()
                .employeeId(empId)
                .genderId(genderId)
                .build();
    }
}
