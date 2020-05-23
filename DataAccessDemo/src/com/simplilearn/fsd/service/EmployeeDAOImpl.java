package com.simplilearn.fsd.service;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.fsd.contract.EmployeeDAO;
import com.simplilearn.fsd.models.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	List<Employee> employees = new ArrayList<Employee>();

	public EmployeeDAOImpl() {
		super();
		employees.add(new Employee(101, "John"));
		employees.add(new Employee(102, "King"));
		employees.add(new Employee(102, "Kochar"));
		employees.add(new Employee(102, "Sarah"));
		employees.add(new Employee(102, "Bowling"));
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employees.get(employeeId);
		}

	@Override
	public void updateEmployee(Employee employee) {
		if(employees.contains(employee)) {
			for(Employee emp:employees) {
				if(emp.getEmployeeId() == employee.getEmployeeId()) {
					emp.setEmployeeName(employee.getEmployeeName());
					System.out.println("Update successfully");
				}
			}
		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		if(employees.contains(employee)) {
			employees.remove(employee.getEmployeeId());
			System.out.println("Employee "+ employee + " removed");
		}
	}

}
