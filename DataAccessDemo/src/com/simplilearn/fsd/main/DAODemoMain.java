package com.simplilearn.fsd.main;

import com.simplilearn.fsd.models.Employee;
import com.simplilearn.fsd.service.EmployeeDAOImpl;

public class DAODemoMain {

	public static void main(String[] args) {
		EmployeeDAOImpl employeeDao = new EmployeeDAOImpl();
		for(Employee employee: employeeDao.getAllEmployees()){
			System.out.println(employee);		
		}
		
		System.out.println("-----------------------------");
		Employee employee = employeeDao.getEmployee(0);
		employee.setEmployeeName("Sahana");
		employeeDao.updateEmployee(employee);
		System.out.println("-----------------------");
		System.out.println(employeeDao.getAllEmployees());
	}
}
