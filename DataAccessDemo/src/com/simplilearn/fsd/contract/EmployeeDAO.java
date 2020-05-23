package com.simplilearn.fsd.contract;

import java.util.List;

import com.simplilearn.fsd.models.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int employeeId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
}
