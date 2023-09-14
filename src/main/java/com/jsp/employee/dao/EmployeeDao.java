package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manali");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	Employee employee = new Employee();

	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;
	}

	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, 1);

		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

			return true;
		} else {
			System.out.println(" Not Deleted ");
			return false;
		}

	}

	public Employee getEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, 1);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getCno());
		System.out.println(employee.getEmail());

		return employee;
	}

	public List<Employee> getAllEmployee() {
		String sql = "SELECT e FROM Employee e";
		Query query = entityManager.createQuery(sql);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	public Employee updateEmployee(Employee employee) {
		if (employee != null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();

		}
		return employee;
	}

}
