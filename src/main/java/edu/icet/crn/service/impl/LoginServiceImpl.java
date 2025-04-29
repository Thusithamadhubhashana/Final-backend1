package edu.icet.crn.service.impl;

import edu.icet.crn.dto.Employee;
import edu.icet.crn.entity.EmployeeEntity;
import edu.icet.crn.repository.LoginRepository;
import edu.icet.crn.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    final LoginRepository loginRepository;
    final ModelMapper modelMapper;

    @Override
    public void signUp(Employee employee) {
        loginRepository.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public boolean logIn(String email, String password) {
        List<EmployeeEntity> byEmail = loginRepository.findByEmail(email);
        for (EmployeeEntity employee : byEmail) {
            if (employee.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
