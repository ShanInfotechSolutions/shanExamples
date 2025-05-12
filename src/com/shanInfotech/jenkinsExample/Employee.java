package com.shanInfotech.jenkinsExample;

public class Employee {
	private int empId;
	private String empName;
	private String empSkills;
	
	public Employee() {
	}

	public Employee(int empId, String empName, String empSkills) {
		this.empId = empId;
		this.empName = empName;
		this.empSkills = empSkills;
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

	public String getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(String empSkills) {
		this.empSkills = empSkills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSkills=" + empSkills + "]";
	}
	
	

}
