package com.jsp.employee.controller;

import java.util.List;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class GetAllEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.getAllEmployee();
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		for(Employee f: employees) {
  			System.out.println("======================");
  			System.out.println(f.getId());
  			System.out.println(f.getName());
  			System.out.println(f.getCno());
  			System.out.println(f.getEmail());
  			System.out.println("=======================");
         }

	}
}
