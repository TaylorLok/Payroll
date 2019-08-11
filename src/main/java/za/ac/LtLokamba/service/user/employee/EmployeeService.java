package za.ac.LtLokamba.service.user.employee;

import za.ac.LtLokamba.domain.user.Employee;
import za.ac.LtLokamba.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee,String>
{
    Set<Employee> getAll();
}
