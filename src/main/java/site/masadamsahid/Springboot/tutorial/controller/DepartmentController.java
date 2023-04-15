package site.masadamsahid.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
  
  @GetMapping("/departments/{id}")
  public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
    return departmentService.fetchDepartmentById(departmentId);
  }
  
  @DeleteMapping("/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId){
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted successfully!";
  }
  
}
