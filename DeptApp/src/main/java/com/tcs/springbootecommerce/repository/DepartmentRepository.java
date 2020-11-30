package com.tcs.springbootecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootecommerce.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public List<Department> findAllByOrganizationId(long id);
}
