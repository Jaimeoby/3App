package com.tcs.springbootecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootecommerce.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee>findAllByOrganizationId(long id);
	public List<Employee> findAllByDepartmentId(long id);

}
