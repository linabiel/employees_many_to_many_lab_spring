package codeclan.EmployeeManyToMany.repositories;

import codeclan.EmployeeManyToMany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
