package site.masadamsahid.Springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.masadamsahid.Springboot.tutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
  
  public Department findByDepartmentName(String departmentName);
  public Department findByDepartmentNameIgnoreCase(String departmentName);
  
}
