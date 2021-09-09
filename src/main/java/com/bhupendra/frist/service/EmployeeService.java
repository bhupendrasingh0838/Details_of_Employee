package com.bhupendra.frist.service;

import com.bhupendra.frist.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    void save(Employee employee);

    void delete(Long id);

    Employee getId(Long id);
    void update(Long id,Employee empoyee);
}
