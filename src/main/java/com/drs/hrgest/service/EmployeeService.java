package com.drs.hrgest.service;

import com.drs.hrgest.model.Employee;

import java.util.List;

public interface EmployeeService {

     Employee addEmployee(Employee employee);

     Employee findEmployee(Long employeeId);

     List<Employee> getEmployees();

     Employee updateEmployee(Employee employee);

     void deleteEmployee(Long employeeId);

}
