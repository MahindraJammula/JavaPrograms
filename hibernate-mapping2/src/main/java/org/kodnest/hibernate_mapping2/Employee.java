package org.kodnest.hibernate_mapping2;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	String team;
	@ManyToMany
	List<Technology> technologies;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String team, List<Technology> technologies) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.team = team;
		this.technologies = technologies;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", team=" + team + ", technologies=" + technologies
				+ "]";
	}

}
