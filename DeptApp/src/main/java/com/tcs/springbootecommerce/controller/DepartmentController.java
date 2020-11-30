package com.tcs.springbootecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springbootecommerce.model.Department;
import com.tcs.springbootecommerce.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/dept")
public class DepartmentController {
	@Autowired
	DepartmentService deptServices;

	@GetMapping
	public List<Department> getDepartments() {
		return deptServices.getDepartments().get();
	}

	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") long departmentid) {
		return deptServices.findById(departmentid).get();
	}
	
//	@GetMapping("/{department_id}")
//	public List<Employee> findEmployeesByDepartmentId(@PathVariable("department_id")long departmentid)
//	{
//		return deptServices.findEmployeesByDepartmentId(departmentid).get();
//	}

	@PostMapping("/create")
	public Department createDepartment(Department department) {
		return deptServices.addDepartment(department);
	}

	@PostMapping("/update")
	public Department updateDepartment(Department department) {
		return deptServices.updateDepartment(department);
	}

	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable("id") long departmentid) {
		deptServices.deleteDepartment(departmentid);
		return "success";
	}

}
