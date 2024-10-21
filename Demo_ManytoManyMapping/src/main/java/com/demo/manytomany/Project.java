package com.demo.manytomany;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name,start , end;
	@ManyToMany
	@JoinTable(name="project_emp",
			joinColumns= @JoinColumn(name="project_id"))
	Set<Employee> employee;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getStart() {
	return start;
	}
	public void setStart(String start) {
	this.start = start;
	}
	public String getEnd() {
	return end;
	}

	public void setEnd(String end) {
	this.end = end;
	}
	public Set<Employee> getEmployee() {
	return employee;
	}
	public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
}
