package com.tcs.springbootecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "organization_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String address;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "organization_departments", joinColumns = @JoinColumn(name ="organization_id"),
//	inverseJoinColumns = @JoinColumn(name = "department_id"))
	private List<Long> departments;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "organization_employees", joinColumns = @JoinColumn(name ="organization_id"),
//	inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private List<Long> employees;
}
