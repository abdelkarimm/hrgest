package com.drs.hrgest.service;

import com.drs.hrgest.exception.EmployeeNotFoundException;
import com.drs.hrgest.model.Employee;
import com.drs.hrgest.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;

    EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findEmployee(Long employeeId) {
       return  employeeRepo.findById(employeeId).orElseThrow();
        
    }

    @Override
    public List<Employee> getEmployees() {


        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        if(employeeRepo.findById(employee.getId()) != null) return employeeRepo.save(employee);
        return null;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepo.delete(findEmployee(employeeId));
    }
}
