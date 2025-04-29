package edu.icet.crn.service.impl;

import edu.icet.crn.dto.Employee;
import edu.icet.crn.entity.EmployeeEntity;
import edu.icet.crn.repository.EmployeeRepository;
import edu.icet.crn.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        employeeEntities.forEach(employeeEntity -> employees.add(modelMapper.map(employeeEntity, Employee.class)));
        return employees;
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
