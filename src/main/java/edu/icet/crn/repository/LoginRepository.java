package edu.icet.crn.repository;

import edu.icet.crn.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findByEmail(String email);
}
