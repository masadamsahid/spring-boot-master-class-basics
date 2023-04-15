package site.masadamsahid.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.masadamsahid.Springboot.tutorial.entity.Department;
import site.masadamsahid.Springboot.tutorial.service.DepartmentService;
import site.masadamsahid.Springboot.tutorial.service.DepartmentServiceImpl;

import java.util.List;

@RestController
public class DepartmentController {
  
  @Autowired
  private DepartmentService departmentService;
  
  @PostMapping("/departments")
  public Department saveDepartment(@RequestBody Department department){
    return departmentService.saveDepartment(department);
  }
  
  @GetMapping("/departments")
  public List<Department> fetchDepaartmentList(){
    return  departmentService.fetchDepartmentList();
  }
  
}
