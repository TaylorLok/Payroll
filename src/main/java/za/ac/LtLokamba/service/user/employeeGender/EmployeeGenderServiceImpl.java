package za.ac.LtLokamba.service.user.employeeGender;

import za.ac.LtLokamba.domain.user.EmployeeGender;
import za.ac.LtLokamba.repository.user.employeeGender.EmployeeGenderRepositoryImpl;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService
{
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepositoryImpl repository;

    private EmployeeGenderServiceImpl()
    {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService()
    {
        if (service == null)service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll()
    {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String s)
    {
        return repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        return repository.update(employeeGender);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }
}
