package com;

public class Employee {

	
	private String employeeName;	
	private int employeeNumber;
	
	public Employee() {
	
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Employee(String employeeName, int employeeNumber) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
	}
	
	
}
