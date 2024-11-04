package edu.miu.cse.onboardtest.service;

import edu.miu.cse.onboardtest.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Optional<Employee> addNewEmployee(Employee book);

    List<Employee> getAllEmployeeOrderBySalaryThenByLastNameDesc();
}
