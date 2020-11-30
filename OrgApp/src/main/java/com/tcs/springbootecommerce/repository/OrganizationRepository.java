package com.tcs.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootecommerce.model.Organization;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
	
}
