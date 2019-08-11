package za.ac.LtLokamba.service.user.employeeGender;

import za.ac.LtLokamba.domain.user.EmployeeGender;
import za.ac.LtLokamba.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService <EmployeeGender,String>
{
    Set<EmployeeGender> getAll();
}
