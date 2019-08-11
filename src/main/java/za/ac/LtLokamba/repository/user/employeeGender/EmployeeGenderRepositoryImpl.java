package za.ac.LtLokamba.repository.user.employeeGender;

import za.ac.LtLokamba.domain.user.EmployeeGender;

import java.util.*;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository
{
    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<String,EmployeeGender> empGender;

    private EmployeeGenderRepositoryImpl ()
    {
        this.empGender = new HashMap<>();
    }

    public static EmployeeGenderRepositoryImpl getRepository()
    {
        if(repository ==null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll()
    {
        Collection employeeGender = this.empGender.values();
        Set<EmployeeGender> set = new HashSet<>();
        set.addAll(employeeGender);
        return set;
    }

    @Override
    public EmployeeGender create(EmployeeGender employee)
    {
        this.empGender.put(employee.getEmployeeId(),employee);
        this.empGender.put(employee.getGenderId(),employee);
        return employee;
    }

    @Override
    public EmployeeGender read(String s)
    {
        return this.empGender.get(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender Gender)
    {
        this.empGender.replace(Gender.getEmployeeId(),Gender);
        this.empGender.replace(Gender.getGenderId(),Gender);
        return Gender;
    }

    @Override
    public void delete(String s)
    {
        this.empGender.remove(s);

    }
}
