package project.u5d10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d10.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
