package com.tcs.springbootecommerce.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springbootecommerce.model.Department;

public interface DepartmentService {
	public Department addDepartment(Department department);
	public Department updateDepartment(Department department);
	public String deleteDepartment(long id);
	public Optional<Department> findById(long id);
	public Optional<List<Department>> getDepartments();
//	public Optional<List<Employee>> findEmployeesByDepartmentId(long id);
}
