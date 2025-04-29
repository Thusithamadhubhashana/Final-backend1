package edu.icet.crn.service;

import edu.icet.crn.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getAll();

    void update(Employee employee);

    void delete(Integer id);
}
