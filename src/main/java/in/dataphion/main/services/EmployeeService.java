package in.dataphion.main.services;

import in.dataphion.main.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> getALlEmployees();
}
