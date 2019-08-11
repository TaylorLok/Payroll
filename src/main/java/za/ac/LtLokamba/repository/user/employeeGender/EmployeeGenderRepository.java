package za.ac.LtLokamba.repository.user.employeeGender;

import za.ac.LtLokamba.domain.user.EmployeeGender;
import za.ac.LtLokamba.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository <EmployeeGender,String>
{
   Set<EmployeeGender> getAll();
}
