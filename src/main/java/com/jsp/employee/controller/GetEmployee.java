package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class GetEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.getEmployee(1);
	}
}
