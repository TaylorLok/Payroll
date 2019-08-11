package za.ac.LtLokamba.repository.user.employee;

import za.ac.LtLokamba.domain.user.Employee;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository
{

    private static EmployeeRepositoryImpl repository = null;
    private Map<String,Employee> employeeMap;

    public EmployeeRepositoryImpl()
    {
        this.employeeMap = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getRepository()
    {
        if (repository==null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll()
    {
        Collection employees = this.employeeMap.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee)
    {
        this.employeeMap.put(employee.getFirstName(),employee);
        this.employeeMap.put(employee.getLastName(),employee);
        this.employeeMap.put(employee.getEmployeeId(),employee);
        return employee;
    }

    @Override
    public Employee read(String s)
    {
        return this.employeeMap.get(s);
    }

    @Override
    public Employee update(Employee emp)
    {
        this.employeeMap.replace(emp.getLastName(),emp);
        this.employeeMap.replace(emp.getLastName(),emp);
        this.employeeMap.replace(emp.getEmployeeId(),emp);

        return emp;
    }

    @Override
    public void delete(String s)
    {
        this.employeeMap.remove(s);
    }
}
