package site.masadamsahid.Springboot.tutorial.service;

import site.masadamsahid.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
  public Department saveDepartment(Department department);
  
  public List<Department> fetchDepartmentList();
}
