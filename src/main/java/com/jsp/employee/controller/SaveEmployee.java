package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class SaveEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();

		employee.setName("MANALI");
		employee.setEmail("manalikadam051@gmail.com");
		employee.setCno(12345678);

		employeeService.saveEmployee(employee);
	}
}
