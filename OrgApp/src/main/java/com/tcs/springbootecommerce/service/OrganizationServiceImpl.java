package com.tcs.springbootecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootecommerce.model.Organization;
import com.tcs.springbootecommerce.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;
	
//	@Autowired
//	EmployeeRepository employeeRepository;
//	
//	@Autowired
//	DepartmentRepository departmentRepository;

//	public OrganizationServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	private static OrganizationService dao;
//	
//	public static OrganizationService getInstance() {
//		if(dao==null)
//		{
//			dao = new OrganizationServiceImpl();
//			return dao;
//		}
//		else
//			return dao;
//	}
//	

	@Override
	public Organization addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		try {
			Organization org = organizationRepository.save(organization);
			return org;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Organization updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		try {
			Organization org = organizationRepository.save(organization);
			return org;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String deleteOrganization(long id) {
		// TODO Auto-generated method stub
		try {
			organizationRepository.deleteById(id);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub
		Optional<Organization> organization = null;
		try {
			organization = organizationRepository.findById(id);
			return organization;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public Optional<List<Organization>> getOrganizations() {
		// TODO Auto-generated method stub
		Optional<List<Organization>> organization = null;
		try {
			organization = Optional.ofNullable(organizationRepository.findAll());
			return organization;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

//	@Override
//	public Optional<List<Department>> findDepartmentsByOrganizationId(long id) {
//		// TODO Auto-generated method stub
//		Optional<List<Department>> deptList = Optional.ofNullable(departmentRepository.findAllByOrganizationId(id));
//		return deptList;
//	}
//
//	@Override
//	public Optional<List<Employee>> findEmployeesByOrganizationId(long id) {
//		// TODO Auto-generated method stub
//		return Optional.ofNullable(employeeRepository.findAllByOrganizationId(id));
//	}

}
