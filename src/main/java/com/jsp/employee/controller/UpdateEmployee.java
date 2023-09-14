package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class UpdateEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.updateEmployee(1, "mana@mail.com");
		System.out.println(employee.getEmail());
	}
}
