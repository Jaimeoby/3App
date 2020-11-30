package com.tcs.springbootecommerce.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springbootecommerce.model.Organization;

public interface OrganizationService {
	public Organization addOrganization(Organization organization);
	public Organization updateOrganization(Organization organization);
	public String deleteOrganization(long id);
	public Optional<Organization> findById(long id);
	public Optional<List<Organization>> getOrganizations();
//	public Optional<List<Department>> findDepartmentsByOrganizationId(long id);
//	Optional<List<Employee>> findEmployeesByOrganizationId(long id);
}
