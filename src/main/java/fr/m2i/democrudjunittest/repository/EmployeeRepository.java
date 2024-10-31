package fr.m2i.democrudjunittest.repository;

import fr.m2i.democrudjunittest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(@Param("name") String name);
    List<Employee> findByDepartment(String department);
}