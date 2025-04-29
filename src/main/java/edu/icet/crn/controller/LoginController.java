package edu.icet.crn.controller;

import edu.icet.crn.dto.Employee;
import edu.icet.crn.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {

    final LoginService loginService;

    @PostMapping("/signup")
    public void signUp(@RequestBody Employee employee) {
        loginService.signUp(employee);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Employee employee) {
        return loginService.logIn(employee.getEmail(), employee.getPassword());
    }
}
