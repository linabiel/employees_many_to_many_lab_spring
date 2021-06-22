package codeclan.EmployeeManyToMany;

import codeclan.EmployeeManyToMany.models.Department;
import codeclan.EmployeeManyToMany.models.Employee;
import codeclan.EmployeeManyToMany.models.Project;
import codeclan.EmployeeManyToMany.repositories.DepartmentRepository;
import codeclan.EmployeeManyToMany.repositories.EmployeeRepository;
import codeclan.EmployeeManyToMany.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeManyToManyApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment() {

		Department department = new Department("Software");

		Employee employee = new Employee("Kieran", "Lamb", 1234, department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Software");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Lina", "Biel", 1234, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Test Project", 2);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}
}
