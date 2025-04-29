package edu.icet.crn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String email;
    private String password;
    private String department;
    private String created_at;
    private String updated_at;

}
