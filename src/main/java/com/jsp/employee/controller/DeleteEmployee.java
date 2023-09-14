package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class DeleteEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		boolean res = employeeService.deleteEmployee(3);
		System.out.println(res);

	}
}
