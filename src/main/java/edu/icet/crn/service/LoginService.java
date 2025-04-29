package edu.icet.crn.service;

import edu.icet.crn.dto.Employee;

public interface LoginService {
    void signUp(Employee employee);
    boolean logIn(String email, String password);
}
