package edu.miu.cse.onboardtest.repository;

import edu.miu.cse.onboardtest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByOrderBySalaryAscLastNameDesc();
}
