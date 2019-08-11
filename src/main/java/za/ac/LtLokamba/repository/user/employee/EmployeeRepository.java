package za.ac.LtLokamba.repository.user.employee;

import za.ac.LtLokamba.domain.user.Employee;
import za.ac.LtLokamba.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository <Employee, String>
{
    Set<Employee> getAll();
}
