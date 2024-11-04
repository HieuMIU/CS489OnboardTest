package edu.miu.cse.onboardtest.service.impl;

import edu.miu.cse.onboardtest.model.Employee;
import edu.miu.cse.onboardtest.repository.EmployeeRepository;
import edu.miu.cse.onboardtest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> addNewEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }

    @Override
    public List<Employee> getAllEmployeeOrderBySalaryThenByLastNameDesc() {
        return employeeRepository.findAllByOrderBySalaryAscLastNameDesc();
    }
}
