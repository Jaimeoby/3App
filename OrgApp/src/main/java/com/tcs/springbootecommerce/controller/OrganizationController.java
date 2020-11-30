package com.tcs.springbootecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springbootecommerce.model.Organization;
import com.tcs.springbootecommerce.service.OrganizationService;

@RestController
@RequestMapping("/api/v1/org")
public class OrganizationController {
	@Autowired
	OrganizationService orgServices;

	@GetMapping
	public List<Organization> getOrganizations() {
		return orgServices.getOrganizations().get();
	}

	@GetMapping("/{id}")
	public Organization getOrganization(@PathVariable("id") long organizationid) {
		return orgServices.findById(organizationid).get();
	}
	
//	@GetMapping("/employees/{organization_id}")
//	public List<Employee> findEmployeesByOrganizationId(@PathVariable("organization_id")long organizationid)
//	{
//		return orgServices.findEmployeesByOrganizationId(organizationid).get();
//	}
//	
//	@GetMapping("/departments/{organization_id}")
//	public List<Department> findDepartmentsByOrganizationId(@PathVariable("organization_id")long organizationid)
//	{
//		return orgServices.findDepartmentsByOrganizationId(organizationid).get();
//	}
//	
	@PostMapping("/create")
	public Organization createOrganization(Organization organization) {
		return orgServices.addOrganization(organization);
	}

	@PostMapping("/update")
	public Organization updateOrganization(Organization organization) {
		return orgServices.updateOrganization(organization);
	}

	@DeleteMapping("/{id}")
	public String deleteOrganization(@PathVariable("id") long organizationid) {
		orgServices.deleteOrganization(organizationid);
		return "success";
	}


}
