package org.kodnest.hibernate_mapping2;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int techId;
	String techName;
	@ManyToMany
	List<Employee> empolyee;

	public Technology() {
		super();
	}

	public Technology(int techId, String techName, List<Employee> empolyee) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.empolyee = empolyee;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public List<Employee> getEmpolyee() {
		return empolyee;
	}

	public void setEmpolyee(List<Employee> empolyee) {
		this.empolyee = empolyee;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", empolyee=" + empolyee + "]";
	}

}
