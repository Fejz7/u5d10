package project.u5d10.services;

import org.springframework.stereotype.Service;
import project.u5d10.entities.Employee;
import project.u5d10.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }
}
