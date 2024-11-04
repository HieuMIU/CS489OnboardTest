package edu.miu.cse.onboardtest;

import edu.miu.cse.onboardtest.model.Employee;
import edu.miu.cse.onboardtest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class OnboardTestApplication {

    private final EmployeeService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnboardTestApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            bookService.addNewEmployee(new Employee(1, "John", "Doe", 50000.0));
            bookService.addNewEmployee(new Employee(2, "Jane", "Dona", 50000.0));
            bookService.addNewEmployee(new Employee(3, "Alice", "Smith", 60000.0));
            bookService.addNewEmployee(new Employee(4, "Bob", "Brown", 45000.0));

            List<Employee> sortEmployees = bookService.getAllEmployeeOrderBySalaryThenByLastNameDesc();
            System.out.println("List Employees:");
            sortEmployees.forEach(o -> System.out.println(o));
        };
    }
}
