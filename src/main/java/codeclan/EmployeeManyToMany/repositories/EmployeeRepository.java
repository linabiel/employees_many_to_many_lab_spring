package codeclan.EmployeeManyToMany.repositories;

import codeclan.EmployeeManyToMany.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
