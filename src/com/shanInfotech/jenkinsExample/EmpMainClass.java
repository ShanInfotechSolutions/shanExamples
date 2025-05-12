package com.shanInfotech.jenkinsExample;

public class EmpMainClass {

	public static void main(String[] args) {
		System.out.println("Hello Ganesh! Welcome To Jenkins World");
		Employee e=new Employee(1901, "Manjunath", "Java DB Jenkins");
		System.out.println(e.getEmpId()+" : "+e.getEmpName()+" : "+e.getEmpSkills());
	}

}
